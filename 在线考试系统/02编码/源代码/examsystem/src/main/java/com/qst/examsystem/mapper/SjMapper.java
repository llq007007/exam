package com.qst.examsystem.mapper;

        import com.qst.examsystem.entity.Sj;

        import java.util.List;
        import java.util.Map;
        import java.util.function.ObjDoubleConsumer;

/**
 * s试卷Mapper
 */
public interface SjMapper {
    /**
     * 组织试卷
     * @param map
     * @return
     */
    List<Map<String, Object>>chouSj(Map map);

    /**
     * 查询所有试卷
     * @return
     */
    List<Sj> selectAllShiJuan();
}
