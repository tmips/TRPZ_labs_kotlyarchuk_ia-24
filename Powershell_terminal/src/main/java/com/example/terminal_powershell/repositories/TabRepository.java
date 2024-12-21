package com.example.terminal_powershell.repositories;

import com.example.terminal_powershell.model.Tab;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TabRepository extends JpaRepository<Tab, Long> {}