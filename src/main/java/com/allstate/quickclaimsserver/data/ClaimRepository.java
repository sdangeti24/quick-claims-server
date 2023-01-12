package com.allstate.quickclaimsserver.data;

import com.allstate.quickclaimsserver.domain.Claim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaimRepository extends JpaRepository<Claim,Integer> {
}
