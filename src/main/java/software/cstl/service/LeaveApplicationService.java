package software.cstl.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import software.cstl.domain.Employee;
import software.cstl.domain.LeaveApplication;
import software.cstl.domain.LeaveType;
import software.cstl.domain.enumeration.LeaveApplicationStatus;
import software.cstl.repository.LeaveApplicationRepository;
import software.cstl.repository.LeaveTypeRepository;
import software.cstl.service.dto.LeaveApplicationDetailDateMapDTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Service Implementation for managing {@link LeaveApplication}.
 */
@Service
@Transactional
public class LeaveApplicationService {

    private final Logger log = LoggerFactory.getLogger(LeaveApplicationService.class);

    private final LeaveApplicationRepository leaveApplicationRepository;

    public LeaveApplicationService(LeaveApplicationRepository leaveApplicationRepository) {
        this.leaveApplicationRepository = leaveApplicationRepository;
    }

    /**
     * Save a leaveApplication.
     *
     * @param leaveApplication the entity to save.
     * @return the persisted entity.
     */
    public LeaveApplication save(LeaveApplication leaveApplication) {
        log.debug("Request to save LeaveApplication : {}", leaveApplication);
        return leaveApplicationRepository.save(leaveApplication);
    }

    /**
     * Get all the leaveApplications.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    @Transactional(readOnly = true)
    public Page<LeaveApplication> findAll(Pageable pageable) {
        log.debug("Request to get all LeaveApplications");
        return leaveApplicationRepository.findAll(pageable);
    }


    /**
     * Get one leaveApplication by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Transactional(readOnly = true)
    public Optional<LeaveApplication> findOne(Long id) {
        log.debug("Request to get LeaveApplication : {}", id);
        return leaveApplicationRepository.findById(id);
    }

    /**
     * Delete the leaveApplication by id.
     *
     * @param id the id of the entity.
     */
    public void delete(Long id) {
        log.debug("Request to delete LeaveApplication : {}", id);
        leaveApplicationRepository.deleteById(id);
    }

    /**
     * Get all the leaveApplications by employee, leaveType, fromDate, toDate, leaveStatus.
     *
     * @param employee the employee.
     * @param leaveType the leaveType.
     * @param fromDate the fromDate.
     * @param toDate the toDate.
     * @param leaveApplicationStatus the leaveApplicationStatus.
     * @return the entity.
     */
    public List<LeaveApplication> getLeaveApplications(Employee employee, LeaveType leaveType, LocalDate fromDate, LocalDate toDate, LeaveApplicationStatus leaveApplicationStatus) {
        return leaveApplicationRepository.findByApplicantEqualsAndLeaveTypeEqualsAndFromIsGreaterThanEqualAndToLessThanEqualAndStatus(employee, leaveType, fromDate, toDate, leaveApplicationStatus);
    }

    /**
     * Get all the leaveApplicationDetailDateMapDTO by leaveApplications.
     *
     * @param leaveApplications the leaveApplications.
     * @return the entity.
     */
    public List<LeaveApplicationDetailDateMapDTO> getLeaveApplicationDetailDateMapDto(List<LeaveApplication> leaveApplications) {
        List<LeaveApplicationDetailDateMapDTO> leaveApplicationDetailDateMapDTOS = new ArrayList<>();
        int counter = 0;
        for(LeaveApplication leaveApplication: leaveApplications) {
            counter = counter + 1;
            LocalDate startDate = leaveApplication.getFrom();
            LocalDate endDate = leaveApplication.getTo().plusDays(1);
            while(startDate.isBefore(endDate)) {
                LeaveApplicationDetailDateMapDTO leaveApplicationDetailDateMapDto = new LeaveApplicationDetailDateMapDTO((long) counter, startDate, leaveApplication.getId());
                startDate = startDate.plusDays(1);
                leaveApplicationDetailDateMapDTOS.add(leaveApplicationDetailDateMapDto);
            }
        }
        return leaveApplicationDetailDateMapDTOS;
    }
}
