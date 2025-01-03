package com.example.terminal_powershell.repositories;

import com.example.terminal_powershell.model.FileExecutor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileExecutorRepository extends JpaRepository<FileExecutor, Long> {}
