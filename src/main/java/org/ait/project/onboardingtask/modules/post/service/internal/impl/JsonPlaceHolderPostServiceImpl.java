package org.ait.project.onboardingtask.modules.post.service.internal.impl;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.ait.project.onboardingtask.modules.post.dto.request.PostReq;
import org.ait.project.onboardingtask.modules.post.dto.response.JsonPlaceHolderPostResponse;
import org.ait.project.onboardingtask.modules.post.model.entity.JsonPlaceHolderPost;
import org.ait.project.onboardingtask.modules.post.service.delegate.JsonPlaceHolderPostDelegate;
import org.ait.project.onboardingtask.modules.post.service.internal.JsonPlaceHolderPostService;
import org.ait.project.onboardingtask.modules.post.transform.JsonPlaceHolderPostTransform;
import org.ait.project.onboardingtask.shared.constant.enums.ResponseEnum;
import org.ait.project.onboardingtask.shared.dto.template.ResponseDetail;
import org.ait.project.onboardingtask.shared.dto.template.ResponseList;
import org.ait.project.onboardingtask.shared.dto.template.ResponseTemplate;
import org.ait.project.onboardingtask.shared.openfeign.jsonplaceholder.JsonPlaceHolderClient;
import org.ait.project.onboardingtask.shared.openfeign.jsonplaceholder.response.PostResponse;
import org.ait.project.onboardingtask.shared.utils.ResponseHelper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JsonPlaceHolderPostServiceImpl implements JsonPlaceHolderPostService {

  private final ResponseHelper responseHelper;

  private final JsonPlaceHolderClient client;

  private final JsonPlaceHolderPostDelegate postDelegate;

  private final JsonPlaceHolderPostTransform postTransform;

  //3
  public ResponseEntity<ResponseTemplate<ResponseList<JsonPlaceHolderPostResponse>>> getAllJsonPlaceHolderPost() {

    List<JsonPlaceHolderPost> jsonPlaceHolderPostList = postDelegate.getAllPost();

    if (jsonPlaceHolderPostList.isEmpty()) {
      List<PostResponse> postResponseList = client.getListPost();
      if (!postResponseList.isEmpty()) {
        jsonPlaceHolderPostList =
            postDelegate.saveAll(postTransform.createJPHPostList(postResponseList));
      }
    }

    return responseHelper.createResponseCollection(ResponseEnum.SUCCESS, null,
        postTransform.createJPHPostResponseList(jsonPlaceHolderPostList));
  }

  @Override
  public ResponseEntity<ResponseTemplate<ResponseList<JsonPlaceHolderPostResponse>>> getAllJsonPlaceHolderPostPage(
      Pageable pageable) {
    Page<JsonPlaceHolderPost> jsonPlaceHolderPostPage = postDelegate.getAllPostPage(pageable);

    return responseHelper.createResponseCollection(ResponseEnum.SUCCESS, jsonPlaceHolderPostPage,
        postTransform.createJPHPostResponseList(jsonPlaceHolderPostPage.getContent()));
  }

  public ResponseEntity<ResponseTemplate<ResponseDetail<JsonPlaceHolderPostResponse>>> getJsonPlaceHolderPostById(
      Integer id) {
    return responseHelper.createResponseDetail(ResponseEnum.SUCCESS,
        postTransform.createJPHPostResponse(postDelegate.getPostById(id)));
  }

  public ResponseEntity<ResponseTemplate<ResponseDetail<JsonPlaceHolderPostResponse>>> addPost(PostReq postReq) {
    client.createPost(postTransform.createJPHPostRequest(postReq));
    JsonPlaceHolderPost jsonPlaceHolderPost =
        postDelegate.save(postTransform.createEntityPost(postReq));
    return responseHelper.createResponseDetail(ResponseEnum.SUCCESS,
        postTransform.createJPHPostResponse(jsonPlaceHolderPost));
  }
}
