package com.example.terminal_powershell.repositories;

import com.example.terminal_powershell.model.CommandExecutor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandExecutorRepository extends JpaRepository<CommandExecutor, Long> {}
