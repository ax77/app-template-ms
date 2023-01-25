package com.publishservice;

import com.publishservice.dto.CVRequest;
import com.publishservice.dto.CVResponse;
import com.publishservice.service.CVService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cv")
@RequiredArgsConstructor
public class CVController {
    private final CVService cvService;

//    {
//        "name": "ax",
//        "vacancy": "prog",
//        "salary": 1200
//    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createCV(@RequestBody CVRequest cvRequest) {
        cvService.createCv(cvRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<CVResponse> getAllCvs() {
        return cvService.getAllCvs();
    }
}
