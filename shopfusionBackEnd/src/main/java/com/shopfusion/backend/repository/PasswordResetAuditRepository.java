package com.shopfusion.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopfusion.backend.entity.PasswordResetAudit;

public interface PasswordResetAuditRepository extends JpaRepository<PasswordResetAudit, Integer> {
}
