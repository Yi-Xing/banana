package top.fblue.banana.domain.file.service.impl;

import org.springframework.stereotype.Service;
import top.fblue.banana.domain.file.entity.File;
import top.fblue.banana.domain.file.repository.FileRepository;
import top.fblue.banana.domain.file.service.FileService;

/**
 * 文件服务实现
 *
 * @author banana
 */
@Service
public class FileServiceImpl implements FileService {

    private final FileRepository fileRepository;

    public FileServiceImpl(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }

    @Override
    public File getById(Long id) {
        return fileRepository.findById(id);
    }

    @Override
    public File create(File entity) {
        return fileRepository.save(entity);
    }

    @Override
    public File update(File entity) {
        return fileRepository.update(entity);
    }

    @Override
    public void delete(Long id) {
        fileRepository.delete(id);
    }
}
