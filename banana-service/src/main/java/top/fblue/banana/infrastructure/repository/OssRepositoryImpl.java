package top.fblue.banana.infrastructure.repository;

import org.springframework.stereotype.Repository;
import top.fblue.banana.domain.oss.entity.Oss;
import top.fblue.banana.domain.oss.repository.OssRepository;
import top.fblue.banana.infrastructure.converter.OssPOConverter;
import top.fblue.banana.infrastructure.mapper.OssMapper;
import top.fblue.banana.infrastructure.po.OssPO;

/**
 * 对象存储仓储实现
 *
 * @author banana
 */
@Repository
public class OssRepositoryImpl implements OssRepository {

    private final OssMapper ossMapper;
    private final OssPOConverter ossPOConverter;

    public OssRepositoryImpl(OssMapper ossMapper, OssPOConverter ossPOConverter) {
        this.ossMapper = ossMapper;
        this.ossPOConverter = ossPOConverter;
    }

    @Override
    public Oss findById(Long id) {
        if (id == null) {
            return null;
        }
        OssPO po = ossMapper.selectById(id);
        return po == null ? null : ossPOConverter.toDomain(po);
    }

    @Override
    public Oss save(Oss entity) {
        OssPO po = ossPOConverter.toPO(entity);
        ossMapper.insert(po);
        return ossPOConverter.toDomain(po);
    }

    @Override
    public Oss update(Oss entity) {
        if (entity == null || entity.getId() == null) {
            return entity;
        }
        OssPO po = ossPOConverter.toPO(entity);
        ossMapper.updateById(po);
        return ossPOConverter.toDomain(ossMapper.selectById(entity.getId()));
    }

    @Override
    public void delete(Long id) {
        if (id != null) {
            ossMapper.deleteById(id);
        }
    }
}
