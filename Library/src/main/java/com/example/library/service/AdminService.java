package com.example.library.service;

import com.example.library.dto.AdminDto;
import com.example.library.model.Admin;
import org.springframework.stereotype.Service;

@Service
public interface AdminService {
    Admin findByUsername(String username);
    Admin save(AdminDto adminDto);
}
