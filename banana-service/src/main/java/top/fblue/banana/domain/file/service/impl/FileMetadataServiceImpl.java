package top.fblue.banana.domain.file.service.impl;

import org.springframework.stereotype.Service;
import top.fblue.banana.domain.file.entity.FileMetadata;
import top.fblue.banana.domain.file.repository.FileMetadataRepository;
import top.fblue.banana.domain.file.service.FileMetadataService;

/**
 * 文件元信息服务实现
 *
 * @author banana
 */
@Service
public class FileMetadataServiceImpl implements FileMetadataService {

    private final FileMetadataRepository fileMetadataRepository;

    public FileMetadataServiceImpl(FileMetadataRepository fileMetadataRepository) {
        this.fileMetadataRepository = fileMetadataRepository;
    }

    @Override
    public FileMetadata getById(Long id) {
        return fileMetadataRepository.findById(id);
    }

    @Override
    public FileMetadata getByFileId(Long fileId) {
        return fileMetadataRepository.findByFileId(fileId);
    }

    @Override
    public FileMetadata create(FileMetadata entity) {
        return fileMetadataRepository.save(entity);
    }

    @Override
    public FileMetadata update(FileMetadata entity) {
        return fileMetadataRepository.update(entity);
    }

    @Override
    public void delete(Long id) {
        fileMetadataRepository.delete(id);
    }
}
