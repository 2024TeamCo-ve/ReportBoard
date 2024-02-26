package com.cove.bloom.model.service;

import com.cove.bloom.model.dao.ReportMapper;
import com.cove.bloom.model.dto.ReportDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ReportService {

    private final ReportMapper reportMapper;

    public ReportService(ReportMapper reportMapper) {
        this.reportMapper = reportMapper;
    }

    public List<ReportDTO> findAllReport() {
        return reportMapper.findAllReport();
    }

    public void updateReport(ReportDTO updateReport){reportMapper.updateReport(updateReport);}

    public void deleteReport(int deleteNum) {
        reportMapper.deleteReport(deleteNum);
    }


    @Transactional
    public void registReport(ReportDTO newReport) {

        reportMapper.registReport(newReport);
    }
}
