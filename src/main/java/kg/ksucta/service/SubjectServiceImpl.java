package kg.ksucta.service;

import kg.ksucta.domain.subject.Subject;
import kg.ksucta.repository.SubjectRepository;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Optional;

@Service
public class SubjectServiceImpl implements SubjectService{
    private final SubjectRepository subjectRepository;

    public SubjectServiceImpl(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    @Override
    public Optional<Subject> getBySubjectName(String subjectName) {
        Assert.hasText(subjectName, "SubjectName must not be empty");
        return subjectRepository.findBySubjectName(subjectName);
    }
}
