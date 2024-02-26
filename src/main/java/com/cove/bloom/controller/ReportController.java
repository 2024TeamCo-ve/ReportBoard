package com.cove.bloom.controller;

import com.cove.bloom.model.dto.ReportDTO;
import com.cove.bloom.model.service.ReportService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/report")
public class ReportController {

    private final ReportService reportService;

    public ReportController(ReportService reportService){
        this.reportService = reportService;
    }

    @GetMapping("/list")
    public String findReportList(Model model){
        List<ReportDTO> reportList = reportService.findAllReport();

        model.addAttribute("reportList",reportList);

        return "report/list";
    }

    @GetMapping("/regist")
    public void registPage(){


    }

    @PostMapping("/regist")
    public String registReport(ReportDTO newReport){
        newReport.setRepMem("김신고");

        reportService.registReport(newReport);

        return "report/result";
    }

    @GetMapping ("update")
    public String updatePage(){
        return "report/update";

    }
    @PostMapping ("update")
    public String updateReport(int repNo, String repRea){
        ReportDTO updateReport = new ReportDTO();

        updateReport.setRepRea(repRea);
        updateReport.setRepNo(repNo);

        reportService.updateReport(updateReport);


        return "Main";
    }


    @GetMapping("delete")
    public void deleteReport(){}





    @PostMapping ("delete")
    public String deleteReport(int deleteNum){


        reportService.deleteReport(deleteNum);


        return "Main";
    }




}
