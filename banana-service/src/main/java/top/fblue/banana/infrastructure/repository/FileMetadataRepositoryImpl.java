package top.fblue.banana.infrastructure.repository;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.springframework.stereotype.Repository;
import top.fblue.banana.domain.file.entity.FileMetadata;
import top.fblue.banana.domain.file.repository.FileMetadataRepository;
import top.fblue.banana.infrastructure.converter.FileMetadataPOConverter;
import top.fblue.banana.infrastructure.mapper.FileMetadataMapper;
import top.fblue.banana.infrastructure.po.FileMetadataPO;

/**
 * 文件元信息仓储实现
 *
 * @author banana
 */
@Repository
public class FileMetadataRepositoryImpl implements FileMetadataRepository {

    private final FileMetadataMapper fileMetadataMapper;
    private final FileMetadataPOConverter fileMetadataPOConverter;

    public FileMetadataRepositoryImpl(FileMetadataMapper fileMetadataMapper, FileMetadataPOConverter fileMetadataPOConverter) {
        this.fileMetadataMapper = fileMetadataMapper;
        this.fileMetadataPOConverter = fileMetadataPOConverter;
    }

    @Override
    public FileMetadata findById(Long id) {
        if (id == null) {
            return null;
        }
        FileMetadataPO po = fileMetadataMapper.selectById(id);
        return po == null ? null : fileMetadataPOConverter.toDomain(po);
    }

    @Override
    public FileMetadata findByFileId(Long fileId) {
        if (fileId == null) {
            return null;
        }
        LambdaQueryWrapper<FileMetadataPO> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(FileMetadataPO::getFileId, fileId).last("LIMIT 1");
        FileMetadataPO po = fileMetadataMapper.selectOne(wrapper);
        return po == null ? null : fileMetadataPOConverter.toDomain(po);
    }

    @Override
    public FileMetadata save(FileMetadata entity) {
        FileMetadataPO po = fileMetadataPOConverter.toPO(entity);
        fileMetadataMapper.insert(po);
        return fileMetadataPOConverter.toDomain(po);
    }

    @Override
    public FileMetadata update(FileMetadata entity) {
        if (entity == null || entity.getId() == null) {
            return entity;
        }
        FileMetadataPO po = fileMetadataPOConverter.toPO(entity);
        fileMetadataMapper.updateById(po);
        return fileMetadataPOConverter.toDomain(fileMetadataMapper.selectById(entity.getId()));
    }

    @Override
    public void delete(Long id) {
        if (id != null) {
            fileMetadataMapper.deleteById(id);
        }
    }
}
