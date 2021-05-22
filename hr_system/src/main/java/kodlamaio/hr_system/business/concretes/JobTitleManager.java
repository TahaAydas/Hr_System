package kodlamaio.hr_system.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hr_system.business.abstracts.JobTitleService;
import kodlamaio.hr_system.dataAccess.abstracts.JobTitleDao;
import kodlamaio.hr_system.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService{
	
	private JobTitleDao jobTitleDao;
	
	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}
	@Override
	public List<JobTitle> getAll() {
		// TODO Auto-generated method stub
		return this.jobTitleDao.findAll();
	}

}
