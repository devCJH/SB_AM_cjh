package com.cjh.exam.demo.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.cjh.exam.demo.vo.Board;

@Mapper
public interface BoardRepository {

	@Select("""
			SELECT *
			FROM board
			WHERE id = #{id}
			AND delStatus = 0;
			""")
	Board getBoardById(int boardId);
}
