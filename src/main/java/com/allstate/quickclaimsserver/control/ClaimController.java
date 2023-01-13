package com.allstate.quickclaimsserver.control;

import com.allstate.quickclaimsserver.domain.Claim;
import com.allstate.quickclaimsserver.exceptions.ClaimNotFoundException;
import com.allstate.quickclaimsserver.service.ClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/claim")
public class ClaimController {

    @Autowired
    private ClaimService claimService;

    @GetMapping()
    public List<Claim> getAllClaims(@RequestParam(value="status", required = false) String status) {
        if (status == null) {
            return claimService.getAllClaims();
        }
        else {
            return claimService.getByStatus(status);
        }
    }

    @GetMapping("/{claimNum}")
    public Claim findById(@PathVariable("claimNum") Integer claimNum) throws ClaimNotFoundException {
        return claimService.getByClaimNum(claimNum);

    }

}
