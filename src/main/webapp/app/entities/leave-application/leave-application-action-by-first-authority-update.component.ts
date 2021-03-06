import { Component, OnInit } from '@angular/core';
import { HttpResponse } from '@angular/common/http';
// eslint-disable-next-line @typescript-eslint/no-unused-vars
import { FormBuilder, Validators } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';
import { Observable } from 'rxjs';

import { ILeaveApplication, LeaveApplication } from 'app/shared/model/leave-application.model';
import { LeaveApplicationService } from './leave-application.service';
import { IUser } from 'app/core/user/user.model';
import { UserService } from 'app/core/user/user.service';
import { ILeaveType } from 'app/shared/model/leave-type.model';
import { LeaveTypeService } from 'app/entities/leave-type/leave-type.service';
import { AccountService } from 'app/core/auth/account.service';
import { Account } from 'app/core/user/account.model';
import { IEmployee } from 'app/shared/model/employee.model';
import { ILeaveBalance } from 'app/shared/model/leave-balance.model';
import { EmployeeService } from 'app/entities/employee/employee.service';
import { LeaveBalanceService } from 'app/entities/leave-balance/leave-balance.service';

type SelectableEntity = IUser | ILeaveType | IEmployee;

@Component({
  selector: 'jhi-leave-application-action-by-first-authority-update',
  templateUrl: './leave-application-action-by-first-authority-update.component.html',
})
export class LeaveApplicationActionByFirstAuthorityUpdateComponent implements OnInit {
  isSaving = false;
  users: IUser[] = [];
  leavetypes: ILeaveType[] = [];
  leaveBalances: ILeaveBalance[] = [];

  employees: IEmployee[] = [];
  fromDp: any;
  toDp: any;
  currentUser: Account | null = null;

  editForm = this.fb.group({
    id: [],
    from: [null, [Validators.required]],
    to: [null, [Validators.required]],
    totalDays: [null, [Validators.required]],
    status: [null, [Validators.required]],
    reason: [null, [Validators.required]],
    appliedBy: [null, Validators.required],
    actionTakenBy: [],
    leaveType: [null, Validators.required],
    applicant: [null, Validators.required],
  });

  constructor(
    protected leaveApplicationService: LeaveApplicationService,
    protected userService: UserService,
    protected leaveTypeService: LeaveTypeService,
    protected employeeService: EmployeeService,
    protected leaveBalanceService: LeaveBalanceService,
    protected activatedRoute: ActivatedRoute,
    protected accountService: AccountService,
    private fb: FormBuilder
  ) {}

  ngOnInit(): void {
    this.accountService.identity().subscribe(currentUser => {
      this.currentUser = currentUser;

      this.activatedRoute.data.subscribe(({ leaveApplication }) => {
        this.updateForm(leaveApplication);

        this.userService.query().subscribe((res: HttpResponse<IUser[]>) => (this.users = res.body || []));

        this.leaveTypeService.query().subscribe((res: HttpResponse<ILeaveType[]>) => (this.leavetypes = res.body || []));

        this.employeeService
          .query({
            'id.equals': leaveApplication.applicant.id,
          })
          .subscribe((res: HttpResponse<IEmployee[]>) => {
            this.employees = res.body || [];

            this.updateForm(leaveApplication);

            if (this.employees) {
              this.leaveBalanceService
                .findByEmployeeId(this.employees[0].id!, new Date().getFullYear())
                .subscribe((res1: HttpResponse<ILeaveBalance[]>) => {
                  this.leaveBalances = res1.body!;
                });
            }
          });
      });
    });
  }

  updateForm(leaveApplication: ILeaveApplication): void {
    this.editForm.patchValue({
      id: leaveApplication.id,
      from: leaveApplication.from,
      to: leaveApplication.to,
      totalDays: leaveApplication.totalDays,
      status: leaveApplication.status,
      reason: leaveApplication.reason,
      appliedBy: leaveApplication.appliedBy,
      actionTakenBy: this.currentUser,
      leaveType: leaveApplication.leaveType,
      applicant: leaveApplication.applicant,
    });
  }

  previousState(): void {
    window.history.back();
  }

  save(): void {
    this.isSaving = true;
    const leaveApplication = this.createFromForm();
    if (leaveApplication.id !== undefined) {
      this.subscribeToSaveResponse(this.leaveApplicationService.update(leaveApplication));
    } else {
      this.subscribeToSaveResponse(this.leaveApplicationService.create(leaveApplication));
    }
  }

  private createFromForm(): ILeaveApplication {
    return {
      ...new LeaveApplication(),
      id: this.editForm.get(['id'])!.value,
      from: this.editForm.get(['from'])!.value,
      to: this.editForm.get(['to'])!.value,
      totalDays: this.editForm.get(['totalDays'])!.value,
      status: this.editForm.get(['status'])!.value,
      reason: this.editForm.get(['reason'])!.value,
      appliedBy: this.editForm.get(['appliedBy'])!.value,
      actionTakenBy: this.editForm.get(['actionTakenBy'])!.value,
      leaveType: this.editForm.get(['leaveType'])!.value,
      applicant: this.editForm.get(['applicant'])!.value,
    };
  }

  protected subscribeToSaveResponse(result: Observable<HttpResponse<ILeaveApplication>>): void {
    result.subscribe(
      () => this.onSaveSuccess(),
      () => this.onSaveError()
    );
  }

  protected onSaveSuccess(): void {
    this.isSaving = false;
    this.previousState();
  }

  protected onSaveError(): void {
    this.isSaving = false;
  }

  trackById(index: number, item: SelectableEntity): any {
    return item.id;
  }
}
