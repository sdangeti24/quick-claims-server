package com.allstate.quickclaimsserver.service;

import com.allstate.quickclaimsserver.domain.Claim;
import com.allstate.quickclaimsserver.exceptions.ClaimNotFoundException;

import java.util.List;

public interface ClaimService {

    public List<Claim> getAllClaims();

    public Claim getByClaimNum(Integer Id) throws ClaimNotFoundException;

    public List<Claim> getByStatus(String status);
}
