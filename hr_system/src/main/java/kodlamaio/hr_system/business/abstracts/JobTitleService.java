package kodlamaio.hr_system.business.abstracts;

import java.util.List;

import kodlamaio.hr_system.entities.concretes.JobTitle;

public interface JobTitleService {
		List<JobTitle> getAll();
}
