package com.example.terminal_powershell.repositories;

import com.example.terminal_powershell.model.Command;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandRepository extends JpaRepository<Command, Long> {}
