package com.allstate.quickclaimsserver.service;

import com.allstate.quickclaimsserver.domain.Claim;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface ClaimService {

    public List<Claim> getAllClaims();
}
