package com.wang.lp.lcoachback.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andTidIsNull() {
            addCriterion("tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Integer value) {
            addCriterion("tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Integer value) {
            addCriterion("tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Integer value) {
            addCriterion("tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Integer value) {
            addCriterion("tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Integer value) {
            addCriterion("tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Integer> values) {
            addCriterion("tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Integer> values) {
            addCriterion("tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Integer value1, Integer value2) {
            addCriterion("tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Integer value1, Integer value2) {
            addCriterion("tid not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andCourseTitleIsNull() {
            addCriterion("course_title is null");
            return (Criteria) this;
        }

        public Criteria andCourseTitleIsNotNull() {
            addCriterion("course_title is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTitleEqualTo(String value) {
            addCriterion("course_title =", value, "courseTitle");
            return (Criteria) this;
        }

        public Criteria andCourseTitleNotEqualTo(String value) {
            addCriterion("course_title <>", value, "courseTitle");
            return (Criteria) this;
        }

        public Criteria andCourseTitleGreaterThan(String value) {
            addCriterion("course_title >", value, "courseTitle");
            return (Criteria) this;
        }

        public Criteria andCourseTitleGreaterThanOrEqualTo(String value) {
            addCriterion("course_title >=", value, "courseTitle");
            return (Criteria) this;
        }

        public Criteria andCourseTitleLessThan(String value) {
            addCriterion("course_title <", value, "courseTitle");
            return (Criteria) this;
        }

        public Criteria andCourseTitleLessThanOrEqualTo(String value) {
            addCriterion("course_title <=", value, "courseTitle");
            return (Criteria) this;
        }

        public Criteria andCourseTitleLike(String value) {
            addCriterion("course_title like", value, "courseTitle");
            return (Criteria) this;
        }

        public Criteria andCourseTitleNotLike(String value) {
            addCriterion("course_title not like", value, "courseTitle");
            return (Criteria) this;
        }

        public Criteria andCourseTitleIn(List<String> values) {
            addCriterion("course_title in", values, "courseTitle");
            return (Criteria) this;
        }

        public Criteria andCourseTitleNotIn(List<String> values) {
            addCriterion("course_title not in", values, "courseTitle");
            return (Criteria) this;
        }

        public Criteria andCourseTitleBetween(String value1, String value2) {
            addCriterion("course_title between", value1, value2, "courseTitle");
            return (Criteria) this;
        }

        public Criteria andCourseTitleNotBetween(String value1, String value2) {
            addCriterion("course_title not between", value1, value2, "courseTitle");
            return (Criteria) this;
        }

        public Criteria andCourseEvaluationIsNull() {
            addCriterion("course_evaluation is null");
            return (Criteria) this;
        }

        public Criteria andCourseEvaluationIsNotNull() {
            addCriterion("course_evaluation is not null");
            return (Criteria) this;
        }

        public Criteria andCourseEvaluationEqualTo(String value) {
            addCriterion("course_evaluation =", value, "courseEvaluation");
            return (Criteria) this;
        }

        public Criteria andCourseEvaluationNotEqualTo(String value) {
            addCriterion("course_evaluation <>", value, "courseEvaluation");
            return (Criteria) this;
        }

        public Criteria andCourseEvaluationGreaterThan(String value) {
            addCriterion("course_evaluation >", value, "courseEvaluation");
            return (Criteria) this;
        }

        public Criteria andCourseEvaluationGreaterThanOrEqualTo(String value) {
            addCriterion("course_evaluation >=", value, "courseEvaluation");
            return (Criteria) this;
        }

        public Criteria andCourseEvaluationLessThan(String value) {
            addCriterion("course_evaluation <", value, "courseEvaluation");
            return (Criteria) this;
        }

        public Criteria andCourseEvaluationLessThanOrEqualTo(String value) {
            addCriterion("course_evaluation <=", value, "courseEvaluation");
            return (Criteria) this;
        }

        public Criteria andCourseEvaluationLike(String value) {
            addCriterion("course_evaluation like", value, "courseEvaluation");
            return (Criteria) this;
        }

        public Criteria andCourseEvaluationNotLike(String value) {
            addCriterion("course_evaluation not like", value, "courseEvaluation");
            return (Criteria) this;
        }

        public Criteria andCourseEvaluationIn(List<String> values) {
            addCriterion("course_evaluation in", values, "courseEvaluation");
            return (Criteria) this;
        }

        public Criteria andCourseEvaluationNotIn(List<String> values) {
            addCriterion("course_evaluation not in", values, "courseEvaluation");
            return (Criteria) this;
        }

        public Criteria andCourseEvaluationBetween(String value1, String value2) {
            addCriterion("course_evaluation between", value1, value2, "courseEvaluation");
            return (Criteria) this;
        }

        public Criteria andCourseEvaluationNotBetween(String value1, String value2) {
            addCriterion("course_evaluation not between", value1, value2, "courseEvaluation");
            return (Criteria) this;
        }

        public Criteria andCourseGradingIsNull() {
            addCriterion("course_grading is null");
            return (Criteria) this;
        }

        public Criteria andCourseGradingIsNotNull() {
            addCriterion("course_grading is not null");
            return (Criteria) this;
        }

        public Criteria andCourseGradingEqualTo(String value) {
            addCriterion("course_grading =", value, "courseGrading");
            return (Criteria) this;
        }

        public Criteria andCourseGradingNotEqualTo(String value) {
            addCriterion("course_grading <>", value, "courseGrading");
            return (Criteria) this;
        }

        public Criteria andCourseGradingGreaterThan(String value) {
            addCriterion("course_grading >", value, "courseGrading");
            return (Criteria) this;
        }

        public Criteria andCourseGradingGreaterThanOrEqualTo(String value) {
            addCriterion("course_grading >=", value, "courseGrading");
            return (Criteria) this;
        }

        public Criteria andCourseGradingLessThan(String value) {
            addCriterion("course_grading <", value, "courseGrading");
            return (Criteria) this;
        }

        public Criteria andCourseGradingLessThanOrEqualTo(String value) {
            addCriterion("course_grading <=", value, "courseGrading");
            return (Criteria) this;
        }

        public Criteria andCourseGradingLike(String value) {
            addCriterion("course_grading like", value, "courseGrading");
            return (Criteria) this;
        }

        public Criteria andCourseGradingNotLike(String value) {
            addCriterion("course_grading not like", value, "courseGrading");
            return (Criteria) this;
        }

        public Criteria andCourseGradingIn(List<String> values) {
            addCriterion("course_grading in", values, "courseGrading");
            return (Criteria) this;
        }

        public Criteria andCourseGradingNotIn(List<String> values) {
            addCriterion("course_grading not in", values, "courseGrading");
            return (Criteria) this;
        }

        public Criteria andCourseGradingBetween(String value1, String value2) {
            addCriterion("course_grading between", value1, value2, "courseGrading");
            return (Criteria) this;
        }

        public Criteria andCourseGradingNotBetween(String value1, String value2) {
            addCriterion("course_grading not between", value1, value2, "courseGrading");
            return (Criteria) this;
        }

        public Criteria andCourseNotesIsNull() {
            addCriterion("course_notes is null");
            return (Criteria) this;
        }

        public Criteria andCourseNotesIsNotNull() {
            addCriterion("course_notes is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNotesEqualTo(String value) {
            addCriterion("course_notes =", value, "courseNotes");
            return (Criteria) this;
        }

        public Criteria andCourseNotesNotEqualTo(String value) {
            addCriterion("course_notes <>", value, "courseNotes");
            return (Criteria) this;
        }

        public Criteria andCourseNotesGreaterThan(String value) {
            addCriterion("course_notes >", value, "courseNotes");
            return (Criteria) this;
        }

        public Criteria andCourseNotesGreaterThanOrEqualTo(String value) {
            addCriterion("course_notes >=", value, "courseNotes");
            return (Criteria) this;
        }

        public Criteria andCourseNotesLessThan(String value) {
            addCriterion("course_notes <", value, "courseNotes");
            return (Criteria) this;
        }

        public Criteria andCourseNotesLessThanOrEqualTo(String value) {
            addCriterion("course_notes <=", value, "courseNotes");
            return (Criteria) this;
        }

        public Criteria andCourseNotesLike(String value) {
            addCriterion("course_notes like", value, "courseNotes");
            return (Criteria) this;
        }

        public Criteria andCourseNotesNotLike(String value) {
            addCriterion("course_notes not like", value, "courseNotes");
            return (Criteria) this;
        }

        public Criteria andCourseNotesIn(List<String> values) {
            addCriterion("course_notes in", values, "courseNotes");
            return (Criteria) this;
        }

        public Criteria andCourseNotesNotIn(List<String> values) {
            addCriterion("course_notes not in", values, "courseNotes");
            return (Criteria) this;
        }

        public Criteria andCourseNotesBetween(String value1, String value2) {
            addCriterion("course_notes between", value1, value2, "courseNotes");
            return (Criteria) this;
        }

        public Criteria andCourseNotesNotBetween(String value1, String value2) {
            addCriterion("course_notes not between", value1, value2, "courseNotes");
            return (Criteria) this;
        }

        public Criteria andDataIsNull() {
            addCriterion("data is null");
            return (Criteria) this;
        }

        public Criteria andDataIsNotNull() {
            addCriterion("data is not null");
            return (Criteria) this;
        }

        public Criteria andDataEqualTo(Date value) {
            addCriterionForJDBCDate("data =", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataNotEqualTo(Date value) {
            addCriterionForJDBCDate("data <>", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataGreaterThan(Date value) {
            addCriterionForJDBCDate("data >", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("data >=", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataLessThan(Date value) {
            addCriterionForJDBCDate("data <", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("data <=", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataIn(List<Date> values) {
            addCriterionForJDBCDate("data in", values, "data");
            return (Criteria) this;
        }

        public Criteria andDataNotIn(List<Date> values) {
            addCriterionForJDBCDate("data not in", values, "data");
            return (Criteria) this;
        }

        public Criteria andDataBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("data between", value1, value2, "data");
            return (Criteria) this;
        }

        public Criteria andDataNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("data not between", value1, value2, "data");
            return (Criteria) this;
        }

        public Criteria andFestivalsIsNull() {
            addCriterion("festivals is null");
            return (Criteria) this;
        }

        public Criteria andFestivalsIsNotNull() {
            addCriterion("festivals is not null");
            return (Criteria) this;
        }

        public Criteria andFestivalsEqualTo(String value) {
            addCriterion("festivals =", value, "festivals");
            return (Criteria) this;
        }

        public Criteria andFestivalsNotEqualTo(String value) {
            addCriterion("festivals <>", value, "festivals");
            return (Criteria) this;
        }

        public Criteria andFestivalsGreaterThan(String value) {
            addCriterion("festivals >", value, "festivals");
            return (Criteria) this;
        }

        public Criteria andFestivalsGreaterThanOrEqualTo(String value) {
            addCriterion("festivals >=", value, "festivals");
            return (Criteria) this;
        }

        public Criteria andFestivalsLessThan(String value) {
            addCriterion("festivals <", value, "festivals");
            return (Criteria) this;
        }

        public Criteria andFestivalsLessThanOrEqualTo(String value) {
            addCriterion("festivals <=", value, "festivals");
            return (Criteria) this;
        }

        public Criteria andFestivalsLike(String value) {
            addCriterion("festivals like", value, "festivals");
            return (Criteria) this;
        }

        public Criteria andFestivalsNotLike(String value) {
            addCriterion("festivals not like", value, "festivals");
            return (Criteria) this;
        }

        public Criteria andFestivalsIn(List<String> values) {
            addCriterion("festivals in", values, "festivals");
            return (Criteria) this;
        }

        public Criteria andFestivalsNotIn(List<String> values) {
            addCriterion("festivals not in", values, "festivals");
            return (Criteria) this;
        }

        public Criteria andFestivalsBetween(String value1, String value2) {
            addCriterion("festivals between", value1, value2, "festivals");
            return (Criteria) this;
        }

        public Criteria andFestivalsNotBetween(String value1, String value2) {
            addCriterion("festivals not between", value1, value2, "festivals");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIsNull() {
            addCriterion("course_type is null");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIsNotNull() {
            addCriterion("course_type is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTypeEqualTo(String value) {
            addCriterion("course_type =", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNotEqualTo(String value) {
            addCriterion("course_type <>", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeGreaterThan(String value) {
            addCriterion("course_type >", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("course_type >=", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeLessThan(String value) {
            addCriterion("course_type <", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeLessThanOrEqualTo(String value) {
            addCriterion("course_type <=", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeLike(String value) {
            addCriterion("course_type like", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNotLike(String value) {
            addCriterion("course_type not like", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIn(List<String> values) {
            addCriterion("course_type in", values, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNotIn(List<String> values) {
            addCriterion("course_type not in", values, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeBetween(String value1, String value2) {
            addCriterion("course_type between", value1, value2, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNotBetween(String value1, String value2) {
            addCriterion("course_type not between", value1, value2, "courseType");
            return (Criteria) this;
        }

        public Criteria andIsConnectedIsNull() {
            addCriterion("is_connected is null");
            return (Criteria) this;
        }

        public Criteria andIsConnectedIsNotNull() {
            addCriterion("is_connected is not null");
            return (Criteria) this;
        }

        public Criteria andIsConnectedEqualTo(Boolean value) {
            addCriterion("is_connected =", value, "isConnected");
            return (Criteria) this;
        }

        public Criteria andIsConnectedNotEqualTo(Boolean value) {
            addCriterion("is_connected <>", value, "isConnected");
            return (Criteria) this;
        }

        public Criteria andIsConnectedGreaterThan(Boolean value) {
            addCriterion("is_connected >", value, "isConnected");
            return (Criteria) this;
        }

        public Criteria andIsConnectedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_connected >=", value, "isConnected");
            return (Criteria) this;
        }

        public Criteria andIsConnectedLessThan(Boolean value) {
            addCriterion("is_connected <", value, "isConnected");
            return (Criteria) this;
        }

        public Criteria andIsConnectedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_connected <=", value, "isConnected");
            return (Criteria) this;
        }

        public Criteria andIsConnectedIn(List<Boolean> values) {
            addCriterion("is_connected in", values, "isConnected");
            return (Criteria) this;
        }

        public Criteria andIsConnectedNotIn(List<Boolean> values) {
            addCriterion("is_connected not in", values, "isConnected");
            return (Criteria) this;
        }

        public Criteria andIsConnectedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_connected between", value1, value2, "isConnected");
            return (Criteria) this;
        }

        public Criteria andIsConnectedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_connected not between", value1, value2, "isConnected");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}