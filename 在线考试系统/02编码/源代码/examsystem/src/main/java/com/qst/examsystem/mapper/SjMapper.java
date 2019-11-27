package com.qst.examsystem.mapper;

        import com.qst.examsystem.entity.Sj;
        import com.qst.examsystem.entity.Testquestion;

        import java.util.List;
        import java.util.Map;
        import java.util.function.ObjDoubleConsumer;

/**
 * s试卷Mapper
 */
public interface SjMapper {
    /**
     * 组织试卷
     * @param
     * @return
     */
    List<Testquestion>chouSj(int cid);

    /**
     * 查询所有试卷
     * @return
     */
    List<Sj> selectAllShiJuan();

    /**
     * 添加试卷
     * @param sj
     * @return
     */
    int addSJ(Sj sj);

    /**
     * 查找试卷id
     * @param sjname
     * @return
     */
    Sj selectShiJuan(String sjname);
}
