package org.ait.project.onboardingtask.modules.post.service.internal;

import org.ait.project.onboardingtask.modules.post.dto.request.PostReq;
import org.ait.project.onboardingtask.modules.post.dto.response.JsonPlaceHolderPostResponse;
import org.ait.project.onboardingtask.shared.dto.template.ResponseDetail;
import org.ait.project.onboardingtask.shared.dto.template.ResponseList;
import org.ait.project.onboardingtask.shared.dto.template.ResponseTemplate;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public interface JsonPlaceHolderPostService {

  //2
  ResponseEntity<ResponseTemplate<ResponseList<JsonPlaceHolderPostResponse>>>getAllJsonPlaceHolderPost();

  ResponseEntity<ResponseTemplate<ResponseList<JsonPlaceHolderPostResponse>>> getAllJsonPlaceHolderPostPage(
      Pageable pageable);

  ResponseEntity<ResponseTemplate<ResponseDetail<JsonPlaceHolderPostResponse>>> getJsonPlaceHolderPostById(
      Integer id);

  ResponseEntity<ResponseTemplate<ResponseDetail<JsonPlaceHolderPostResponse>>> addPost(PostReq postReq);
}
