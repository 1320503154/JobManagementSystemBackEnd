package com.voyager.service;


import com.voyager.domain.pojo.ApplicationReview;

import java.util.List;

public interface ApplicationReviewService {
    ApplicationReview findByApplyId(int applyId);
    List<ApplicationReview> findByJobId(int jobId);
    List<ApplicationReview> findByIdNumber(String idNumber);
    List<ApplicationReview> findByStatus(int status);
    void deleteByJobId(int jobId);
     void insert(ApplicationReview applicationReview) ;
     void update(ApplicationReview applicationReview) ;
     void deleteByApplyId(int applyId);
}
