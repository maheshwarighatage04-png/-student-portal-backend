package com.example.demo.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.model.Application;
import com.example.demo.repository.ApplicationRepository;

@Service
public class ApplicationService {

    private final ApplicationRepository appRepo;

    public ApplicationService(ApplicationRepository appRepo) {
        this.appRepo = appRepo;
    }

    public Application submit(Application app) {
        return appRepo.save(app);
    }

    public List<Application> getAll() {
        return appRepo.findAll();
    }

    public Application updateStatus(String id, String status) {
        Application app = appRepo.findById(id).orElse(null);
        if (app != null) {
            app.setStatus(status);
            return appRepo.save(app);
        }
        return null;
    }

    public void delete(String id) {
        appRepo.deleteById(id);
    }

	public Application saveApplication(Application application) {
		// TODO Auto-generated method stub
		return null;
	}
}
