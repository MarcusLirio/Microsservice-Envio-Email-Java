package com.microsservice.email.repositories;

import com.microsservice.email.model.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepositories extends JpaRepository<EmailModel, Long> {
}
