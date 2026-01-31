package top.fblue.banana.infrastructure.repository;

import org.springframework.stereotype.Repository;
import top.fblue.banana.domain.file.entity.File;
import top.fblue.banana.domain.file.repository.FileRepository;
import top.fblue.banana.infrastructure.converter.FilePOConverter;
import top.fblue.banana.infrastructure.mapper.FileMapper;
import top.fblue.banana.infrastructure.po.FilePO;

/**
 * 文件仓储实现
 *
 * @author banana
 */
@Repository
public class FileRepositoryImpl implements FileRepository {

    private final FileMapper fileMapper;
    private final FilePOConverter filePOConverter;

    public FileRepositoryImpl(FileMapper fileMapper, FilePOConverter filePOConverter) {
        this.fileMapper = fileMapper;
        this.filePOConverter = filePOConverter;
    }

    @Override
    public File findById(Long id) {
        if (id == null) {
            return null;
        }
        FilePO po = fileMapper.selectById(id);
        return po == null ? null : filePOConverter.toDomain(po);
    }

    @Override
    public File save(File entity) {
        FilePO po = filePOConverter.toPO(entity);
        fileMapper.insert(po);
        return filePOConverter.toDomain(po);
    }

    @Override
    public File update(File entity) {
        if (entity == null || entity.getId() == null) {
            return entity;
        }
        FilePO po = filePOConverter.toPO(entity);
        fileMapper.updateById(po);
        return filePOConverter.toDomain(fileMapper.selectById(entity.getId()));
    }

    @Override
    public void delete(Long id) {
        if (id != null) {
            fileMapper.deleteById(id);
        }
    }
}
