/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.compute.v1.stub;

import static com.google.cloud.compute.v1.RegionInstanceGroupManagerClient.ListErrorsRegionInstanceGroupManagersPagedResponse;
import static com.google.cloud.compute.v1.RegionInstanceGroupManagerClient.ListManagedInstancesRegionInstanceGroupManagersPagedResponse;
import static com.google.cloud.compute.v1.RegionInstanceGroupManagerClient.ListPerInstanceConfigsRegionInstanceGroupManagersPagedResponse;
import static com.google.cloud.compute.v1.RegionInstanceGroupManagerClient.ListRegionInstanceGroupManagersPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.HttpJsonTransportChannel;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.AbandonInstancesRegionInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.ApplyUpdatesToInstancesRegionInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.CreateInstancesRegionInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.DeleteInstancesRegionInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.DeletePerInstanceConfigsRegionInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.DeleteRegionInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.GetRegionInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.InsertRegionInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.InstanceGroupManager;
import com.google.cloud.compute.v1.InstanceManagedByIgmError;
import com.google.cloud.compute.v1.ListErrorsRegionInstanceGroupManagersHttpRequest;
import com.google.cloud.compute.v1.ListManagedInstancesRegionInstanceGroupManagersHttpRequest;
import com.google.cloud.compute.v1.ListPerInstanceConfigsRegionInstanceGroupManagersHttpRequest;
import com.google.cloud.compute.v1.ListRegionInstanceGroupManagersHttpRequest;
import com.google.cloud.compute.v1.ManagedInstance;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.PatchPerInstanceConfigsRegionInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.PatchRegionInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.PerInstanceConfig;
import com.google.cloud.compute.v1.RecreateInstancesRegionInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.RegionInstanceGroupManagerList;
import com.google.cloud.compute.v1.RegionInstanceGroupManagersListErrorsResponse;
import com.google.cloud.compute.v1.RegionInstanceGroupManagersListInstanceConfigsResp;
import com.google.cloud.compute.v1.RegionInstanceGroupManagersListInstancesResponse;
import com.google.cloud.compute.v1.ResizeRegionInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.SetInstanceTemplateRegionInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.SetTargetPoolsRegionInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.UpdatePerInstanceConfigsRegionInstanceGroupManagerHttpRequest;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link RegionInstanceGroupManagerStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (https://compute.googleapis.com/compute/v1/projects/) and
 *       default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of abandonInstancesRegionInstanceGroupManager to 30
 * seconds:
 *
 * <pre>
 * <code>
 * RegionInstanceGroupManagerStubSettings.Builder regionInstanceGroupManagerSettingsBuilder =
 *     RegionInstanceGroupManagerStubSettings.newBuilder();
 * regionInstanceGroupManagerSettingsBuilder
 *     .abandonInstancesRegionInstanceGroupManagerSettings()
 *     .setRetrySettings(
 *         regionInstanceGroupManagerSettingsBuilder.abandonInstancesRegionInstanceGroupManagerSettings().getRetrySettings().toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * RegionInstanceGroupManagerStubSettings regionInstanceGroupManagerSettings = regionInstanceGroupManagerSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class RegionInstanceGroupManagerStubSettings
    extends StubSettings<RegionInstanceGroupManagerStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/cloud-platform")
          .add("https://www.googleapis.com/auth/compute")
          .add("https://www.googleapis.com/auth/compute.readonly")
          .add("https://www.googleapis.com/auth/devstorage.full_control")
          .add("https://www.googleapis.com/auth/devstorage.read_only")
          .add("https://www.googleapis.com/auth/devstorage.read_write")
          .build();

  private final UnaryCallSettings<AbandonInstancesRegionInstanceGroupManagerHttpRequest, Operation>
      abandonInstancesRegionInstanceGroupManagerSettings;
  private final UnaryCallSettings<
          ApplyUpdatesToInstancesRegionInstanceGroupManagerHttpRequest, Operation>
      applyUpdatesToInstancesRegionInstanceGroupManagerSettings;
  private final UnaryCallSettings<CreateInstancesRegionInstanceGroupManagerHttpRequest, Operation>
      createInstancesRegionInstanceGroupManagerSettings;
  private final UnaryCallSettings<DeleteRegionInstanceGroupManagerHttpRequest, Operation>
      deleteRegionInstanceGroupManagerSettings;
  private final UnaryCallSettings<DeleteInstancesRegionInstanceGroupManagerHttpRequest, Operation>
      deleteInstancesRegionInstanceGroupManagerSettings;
  private final UnaryCallSettings<
          DeletePerInstanceConfigsRegionInstanceGroupManagerHttpRequest, Operation>
      deletePerInstanceConfigsRegionInstanceGroupManagerSettings;
  private final UnaryCallSettings<GetRegionInstanceGroupManagerHttpRequest, InstanceGroupManager>
      getRegionInstanceGroupManagerSettings;
  private final UnaryCallSettings<InsertRegionInstanceGroupManagerHttpRequest, Operation>
      insertRegionInstanceGroupManagerSettings;
  private final PagedCallSettings<
          ListRegionInstanceGroupManagersHttpRequest,
          RegionInstanceGroupManagerList,
          ListRegionInstanceGroupManagersPagedResponse>
      listRegionInstanceGroupManagersSettings;
  private final PagedCallSettings<
          ListErrorsRegionInstanceGroupManagersHttpRequest,
          RegionInstanceGroupManagersListErrorsResponse,
          ListErrorsRegionInstanceGroupManagersPagedResponse>
      listErrorsRegionInstanceGroupManagersSettings;
  private final PagedCallSettings<
          ListManagedInstancesRegionInstanceGroupManagersHttpRequest,
          RegionInstanceGroupManagersListInstancesResponse,
          ListManagedInstancesRegionInstanceGroupManagersPagedResponse>
      listManagedInstancesRegionInstanceGroupManagersSettings;
  private final PagedCallSettings<
          ListPerInstanceConfigsRegionInstanceGroupManagersHttpRequest,
          RegionInstanceGroupManagersListInstanceConfigsResp,
          ListPerInstanceConfigsRegionInstanceGroupManagersPagedResponse>
      listPerInstanceConfigsRegionInstanceGroupManagersSettings;
  private final UnaryCallSettings<PatchRegionInstanceGroupManagerHttpRequest, Operation>
      patchRegionInstanceGroupManagerSettings;
  private final UnaryCallSettings<
          PatchPerInstanceConfigsRegionInstanceGroupManagerHttpRequest, Operation>
      patchPerInstanceConfigsRegionInstanceGroupManagerSettings;
  private final UnaryCallSettings<RecreateInstancesRegionInstanceGroupManagerHttpRequest, Operation>
      recreateInstancesRegionInstanceGroupManagerSettings;
  private final UnaryCallSettings<ResizeRegionInstanceGroupManagerHttpRequest, Operation>
      resizeRegionInstanceGroupManagerSettings;
  private final UnaryCallSettings<
          SetInstanceTemplateRegionInstanceGroupManagerHttpRequest, Operation>
      setInstanceTemplateRegionInstanceGroupManagerSettings;
  private final UnaryCallSettings<SetTargetPoolsRegionInstanceGroupManagerHttpRequest, Operation>
      setTargetPoolsRegionInstanceGroupManagerSettings;
  private final UnaryCallSettings<
          UpdatePerInstanceConfigsRegionInstanceGroupManagerHttpRequest, Operation>
      updatePerInstanceConfigsRegionInstanceGroupManagerSettings;

  /**
   * Returns the object with the settings used for calls to
   * abandonInstancesRegionInstanceGroupManager.
   */
  public UnaryCallSettings<AbandonInstancesRegionInstanceGroupManagerHttpRequest, Operation>
      abandonInstancesRegionInstanceGroupManagerSettings() {
    return abandonInstancesRegionInstanceGroupManagerSettings;
  }

  /**
   * Returns the object with the settings used for calls to
   * applyUpdatesToInstancesRegionInstanceGroupManager.
   */
  public UnaryCallSettings<ApplyUpdatesToInstancesRegionInstanceGroupManagerHttpRequest, Operation>
      applyUpdatesToInstancesRegionInstanceGroupManagerSettings() {
    return applyUpdatesToInstancesRegionInstanceGroupManagerSettings;
  }

  /**
   * Returns the object with the settings used for calls to
   * createInstancesRegionInstanceGroupManager.
   */
  public UnaryCallSettings<CreateInstancesRegionInstanceGroupManagerHttpRequest, Operation>
      createInstancesRegionInstanceGroupManagerSettings() {
    return createInstancesRegionInstanceGroupManagerSettings;
  }

  /** Returns the object with the settings used for calls to deleteRegionInstanceGroupManager. */
  public UnaryCallSettings<DeleteRegionInstanceGroupManagerHttpRequest, Operation>
      deleteRegionInstanceGroupManagerSettings() {
    return deleteRegionInstanceGroupManagerSettings;
  }

  /**
   * Returns the object with the settings used for calls to
   * deleteInstancesRegionInstanceGroupManager.
   */
  public UnaryCallSettings<DeleteInstancesRegionInstanceGroupManagerHttpRequest, Operation>
      deleteInstancesRegionInstanceGroupManagerSettings() {
    return deleteInstancesRegionInstanceGroupManagerSettings;
  }

  /**
   * Returns the object with the settings used for calls to
   * deletePerInstanceConfigsRegionInstanceGroupManager.
   */
  public UnaryCallSettings<DeletePerInstanceConfigsRegionInstanceGroupManagerHttpRequest, Operation>
      deletePerInstanceConfigsRegionInstanceGroupManagerSettings() {
    return deletePerInstanceConfigsRegionInstanceGroupManagerSettings;
  }

  /** Returns the object with the settings used for calls to getRegionInstanceGroupManager. */
  public UnaryCallSettings<GetRegionInstanceGroupManagerHttpRequest, InstanceGroupManager>
      getRegionInstanceGroupManagerSettings() {
    return getRegionInstanceGroupManagerSettings;
  }

  /** Returns the object with the settings used for calls to insertRegionInstanceGroupManager. */
  public UnaryCallSettings<InsertRegionInstanceGroupManagerHttpRequest, Operation>
      insertRegionInstanceGroupManagerSettings() {
    return insertRegionInstanceGroupManagerSettings;
  }

  /** Returns the object with the settings used for calls to listRegionInstanceGroupManagers. */
  public PagedCallSettings<
          ListRegionInstanceGroupManagersHttpRequest,
          RegionInstanceGroupManagerList,
          ListRegionInstanceGroupManagersPagedResponse>
      listRegionInstanceGroupManagersSettings() {
    return listRegionInstanceGroupManagersSettings;
  }

  /**
   * Returns the object with the settings used for calls to listErrorsRegionInstanceGroupManagers.
   */
  public PagedCallSettings<
          ListErrorsRegionInstanceGroupManagersHttpRequest,
          RegionInstanceGroupManagersListErrorsResponse,
          ListErrorsRegionInstanceGroupManagersPagedResponse>
      listErrorsRegionInstanceGroupManagersSettings() {
    return listErrorsRegionInstanceGroupManagersSettings;
  }

  /**
   * Returns the object with the settings used for calls to
   * listManagedInstancesRegionInstanceGroupManagers.
   */
  public PagedCallSettings<
          ListManagedInstancesRegionInstanceGroupManagersHttpRequest,
          RegionInstanceGroupManagersListInstancesResponse,
          ListManagedInstancesRegionInstanceGroupManagersPagedResponse>
      listManagedInstancesRegionInstanceGroupManagersSettings() {
    return listManagedInstancesRegionInstanceGroupManagersSettings;
  }

  /**
   * Returns the object with the settings used for calls to
   * listPerInstanceConfigsRegionInstanceGroupManagers.
   */
  public PagedCallSettings<
          ListPerInstanceConfigsRegionInstanceGroupManagersHttpRequest,
          RegionInstanceGroupManagersListInstanceConfigsResp,
          ListPerInstanceConfigsRegionInstanceGroupManagersPagedResponse>
      listPerInstanceConfigsRegionInstanceGroupManagersSettings() {
    return listPerInstanceConfigsRegionInstanceGroupManagersSettings;
  }

  /** Returns the object with the settings used for calls to patchRegionInstanceGroupManager. */
  public UnaryCallSettings<PatchRegionInstanceGroupManagerHttpRequest, Operation>
      patchRegionInstanceGroupManagerSettings() {
    return patchRegionInstanceGroupManagerSettings;
  }

  /**
   * Returns the object with the settings used for calls to
   * patchPerInstanceConfigsRegionInstanceGroupManager.
   */
  public UnaryCallSettings<PatchPerInstanceConfigsRegionInstanceGroupManagerHttpRequest, Operation>
      patchPerInstanceConfigsRegionInstanceGroupManagerSettings() {
    return patchPerInstanceConfigsRegionInstanceGroupManagerSettings;
  }

  /**
   * Returns the object with the settings used for calls to
   * recreateInstancesRegionInstanceGroupManager.
   */
  public UnaryCallSettings<RecreateInstancesRegionInstanceGroupManagerHttpRequest, Operation>
      recreateInstancesRegionInstanceGroupManagerSettings() {
    return recreateInstancesRegionInstanceGroupManagerSettings;
  }

  /** Returns the object with the settings used for calls to resizeRegionInstanceGroupManager. */
  public UnaryCallSettings<ResizeRegionInstanceGroupManagerHttpRequest, Operation>
      resizeRegionInstanceGroupManagerSettings() {
    return resizeRegionInstanceGroupManagerSettings;
  }

  /**
   * Returns the object with the settings used for calls to
   * setInstanceTemplateRegionInstanceGroupManager.
   */
  public UnaryCallSettings<SetInstanceTemplateRegionInstanceGroupManagerHttpRequest, Operation>
      setInstanceTemplateRegionInstanceGroupManagerSettings() {
    return setInstanceTemplateRegionInstanceGroupManagerSettings;
  }

  /**
   * Returns the object with the settings used for calls to
   * setTargetPoolsRegionInstanceGroupManager.
   */
  public UnaryCallSettings<SetTargetPoolsRegionInstanceGroupManagerHttpRequest, Operation>
      setTargetPoolsRegionInstanceGroupManagerSettings() {
    return setTargetPoolsRegionInstanceGroupManagerSettings;
  }

  /**
   * Returns the object with the settings used for calls to
   * updatePerInstanceConfigsRegionInstanceGroupManager.
   */
  public UnaryCallSettings<UpdatePerInstanceConfigsRegionInstanceGroupManagerHttpRequest, Operation>
      updatePerInstanceConfigsRegionInstanceGroupManagerSettings() {
    return updatePerInstanceConfigsRegionInstanceGroupManagerSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public RegionInstanceGroupManagerStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonRegionInstanceGroupManagerStub.create(this);
    } else {
      throw new UnsupportedOperationException(
          "Transport not supported: " + getTransportChannelProvider().getTransportName());
    }
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return "https://compute.googleapis.com/compute/v1/projects/";
  }

  /** Returns the default service port. */
  public static int getDefaultServicePort() {
    return 443;
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder().setScopesToApply(DEFAULT_SERVICE_SCOPES);
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return InstantiatingHttpJsonChannelProvider.newBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultHttpJsonTransportProviderBuilder().build();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(RegionInstanceGroupManagerStubSettings.class))
        .setTransportToken(
            GaxHttpJsonProperties.getHttpJsonTokenName(),
            GaxHttpJsonProperties.getHttpJsonVersion());
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected RegionInstanceGroupManagerStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    abandonInstancesRegionInstanceGroupManagerSettings =
        settingsBuilder.abandonInstancesRegionInstanceGroupManagerSettings().build();
    applyUpdatesToInstancesRegionInstanceGroupManagerSettings =
        settingsBuilder.applyUpdatesToInstancesRegionInstanceGroupManagerSettings().build();
    createInstancesRegionInstanceGroupManagerSettings =
        settingsBuilder.createInstancesRegionInstanceGroupManagerSettings().build();
    deleteRegionInstanceGroupManagerSettings =
        settingsBuilder.deleteRegionInstanceGroupManagerSettings().build();
    deleteInstancesRegionInstanceGroupManagerSettings =
        settingsBuilder.deleteInstancesRegionInstanceGroupManagerSettings().build();
    deletePerInstanceConfigsRegionInstanceGroupManagerSettings =
        settingsBuilder.deletePerInstanceConfigsRegionInstanceGroupManagerSettings().build();
    getRegionInstanceGroupManagerSettings =
        settingsBuilder.getRegionInstanceGroupManagerSettings().build();
    insertRegionInstanceGroupManagerSettings =
        settingsBuilder.insertRegionInstanceGroupManagerSettings().build();
    listRegionInstanceGroupManagersSettings =
        settingsBuilder.listRegionInstanceGroupManagersSettings().build();
    listErrorsRegionInstanceGroupManagersSettings =
        settingsBuilder.listErrorsRegionInstanceGroupManagersSettings().build();
    listManagedInstancesRegionInstanceGroupManagersSettings =
        settingsBuilder.listManagedInstancesRegionInstanceGroupManagersSettings().build();
    listPerInstanceConfigsRegionInstanceGroupManagersSettings =
        settingsBuilder.listPerInstanceConfigsRegionInstanceGroupManagersSettings().build();
    patchRegionInstanceGroupManagerSettings =
        settingsBuilder.patchRegionInstanceGroupManagerSettings().build();
    patchPerInstanceConfigsRegionInstanceGroupManagerSettings =
        settingsBuilder.patchPerInstanceConfigsRegionInstanceGroupManagerSettings().build();
    recreateInstancesRegionInstanceGroupManagerSettings =
        settingsBuilder.recreateInstancesRegionInstanceGroupManagerSettings().build();
    resizeRegionInstanceGroupManagerSettings =
        settingsBuilder.resizeRegionInstanceGroupManagerSettings().build();
    setInstanceTemplateRegionInstanceGroupManagerSettings =
        settingsBuilder.setInstanceTemplateRegionInstanceGroupManagerSettings().build();
    setTargetPoolsRegionInstanceGroupManagerSettings =
        settingsBuilder.setTargetPoolsRegionInstanceGroupManagerSettings().build();
    updatePerInstanceConfigsRegionInstanceGroupManagerSettings =
        settingsBuilder.updatePerInstanceConfigsRegionInstanceGroupManagerSettings().build();
  }

  private static final PagedListDescriptor<
          ListRegionInstanceGroupManagersHttpRequest,
          RegionInstanceGroupManagerList,
          InstanceGroupManager>
      LIST_REGION_INSTANCE_GROUP_MANAGERS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListRegionInstanceGroupManagersHttpRequest,
              RegionInstanceGroupManagerList,
              InstanceGroupManager>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListRegionInstanceGroupManagersHttpRequest injectToken(
                ListRegionInstanceGroupManagersHttpRequest payload, String token) {
              return ListRegionInstanceGroupManagersHttpRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListRegionInstanceGroupManagersHttpRequest injectPageSize(
                ListRegionInstanceGroupManagersHttpRequest payload, int pageSize) {
              return ListRegionInstanceGroupManagersHttpRequest.newBuilder(payload)
                  .setMaxResults(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListRegionInstanceGroupManagersHttpRequest payload) {
              return payload.getMaxResults();
            }

            @Override
            public String extractNextToken(RegionInstanceGroupManagerList payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<InstanceGroupManager> extractResources(
                RegionInstanceGroupManagerList payload) {
              return payload.getItemsList() != null
                  ? payload.getItemsList()
                  : ImmutableList.<InstanceGroupManager>of();
            }
          };

  private static final PagedListDescriptor<
          ListErrorsRegionInstanceGroupManagersHttpRequest,
          RegionInstanceGroupManagersListErrorsResponse,
          InstanceManagedByIgmError>
      LIST_ERRORS_REGION_INSTANCE_GROUP_MANAGERS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListErrorsRegionInstanceGroupManagersHttpRequest,
              RegionInstanceGroupManagersListErrorsResponse,
              InstanceManagedByIgmError>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListErrorsRegionInstanceGroupManagersHttpRequest injectToken(
                ListErrorsRegionInstanceGroupManagersHttpRequest payload, String token) {
              return ListErrorsRegionInstanceGroupManagersHttpRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListErrorsRegionInstanceGroupManagersHttpRequest injectPageSize(
                ListErrorsRegionInstanceGroupManagersHttpRequest payload, int pageSize) {
              return ListErrorsRegionInstanceGroupManagersHttpRequest.newBuilder(payload)
                  .setMaxResults(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(
                ListErrorsRegionInstanceGroupManagersHttpRequest payload) {
              return payload.getMaxResults();
            }

            @Override
            public String extractNextToken(RegionInstanceGroupManagersListErrorsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<InstanceManagedByIgmError> extractResources(
                RegionInstanceGroupManagersListErrorsResponse payload) {
              return payload.getItemsList() != null
                  ? payload.getItemsList()
                  : ImmutableList.<InstanceManagedByIgmError>of();
            }
          };

  private static final PagedListDescriptor<
          ListManagedInstancesRegionInstanceGroupManagersHttpRequest,
          RegionInstanceGroupManagersListInstancesResponse,
          ManagedInstance>
      LIST_MANAGED_INSTANCES_REGION_INSTANCE_GROUP_MANAGERS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListManagedInstancesRegionInstanceGroupManagersHttpRequest,
              RegionInstanceGroupManagersListInstancesResponse,
              ManagedInstance>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListManagedInstancesRegionInstanceGroupManagersHttpRequest injectToken(
                ListManagedInstancesRegionInstanceGroupManagersHttpRequest payload, String token) {
              return ListManagedInstancesRegionInstanceGroupManagersHttpRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListManagedInstancesRegionInstanceGroupManagersHttpRequest injectPageSize(
                ListManagedInstancesRegionInstanceGroupManagersHttpRequest payload, int pageSize) {
              return ListManagedInstancesRegionInstanceGroupManagersHttpRequest.newBuilder(payload)
                  .setMaxResults(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(
                ListManagedInstancesRegionInstanceGroupManagersHttpRequest payload) {
              return payload.getMaxResults();
            }

            @Override
            public String extractNextToken(
                RegionInstanceGroupManagersListInstancesResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<ManagedInstance> extractResources(
                RegionInstanceGroupManagersListInstancesResponse payload) {
              return payload.getManagedInstancesList() != null
                  ? payload.getManagedInstancesList()
                  : ImmutableList.<ManagedInstance>of();
            }
          };

  private static final PagedListDescriptor<
          ListPerInstanceConfigsRegionInstanceGroupManagersHttpRequest,
          RegionInstanceGroupManagersListInstanceConfigsResp,
          PerInstanceConfig>
      LIST_PER_INSTANCE_CONFIGS_REGION_INSTANCE_GROUP_MANAGERS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListPerInstanceConfigsRegionInstanceGroupManagersHttpRequest,
              RegionInstanceGroupManagersListInstanceConfigsResp,
              PerInstanceConfig>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListPerInstanceConfigsRegionInstanceGroupManagersHttpRequest injectToken(
                ListPerInstanceConfigsRegionInstanceGroupManagersHttpRequest payload,
                String token) {
              return ListPerInstanceConfigsRegionInstanceGroupManagersHttpRequest.newBuilder(
                      payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListPerInstanceConfigsRegionInstanceGroupManagersHttpRequest injectPageSize(
                ListPerInstanceConfigsRegionInstanceGroupManagersHttpRequest payload,
                int pageSize) {
              return ListPerInstanceConfigsRegionInstanceGroupManagersHttpRequest.newBuilder(
                      payload)
                  .setMaxResults(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(
                ListPerInstanceConfigsRegionInstanceGroupManagersHttpRequest payload) {
              return payload.getMaxResults();
            }

            @Override
            public String extractNextToken(
                RegionInstanceGroupManagersListInstanceConfigsResp payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<PerInstanceConfig> extractResources(
                RegionInstanceGroupManagersListInstanceConfigsResp payload) {
              return payload.getItemsList() != null
                  ? payload.getItemsList()
                  : ImmutableList.<PerInstanceConfig>of();
            }
          };

  private static final PagedListResponseFactory<
          ListRegionInstanceGroupManagersHttpRequest,
          RegionInstanceGroupManagerList,
          ListRegionInstanceGroupManagersPagedResponse>
      LIST_REGION_INSTANCE_GROUP_MANAGERS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListRegionInstanceGroupManagersHttpRequest,
              RegionInstanceGroupManagerList,
              ListRegionInstanceGroupManagersPagedResponse>() {
            @Override
            public ApiFuture<ListRegionInstanceGroupManagersPagedResponse> getFuturePagedResponse(
                UnaryCallable<
                        ListRegionInstanceGroupManagersHttpRequest, RegionInstanceGroupManagerList>
                    callable,
                ListRegionInstanceGroupManagersHttpRequest request,
                ApiCallContext context,
                ApiFuture<RegionInstanceGroupManagerList> futureResponse) {
              PageContext<
                      ListRegionInstanceGroupManagersHttpRequest,
                      RegionInstanceGroupManagerList,
                      InstanceGroupManager>
                  pageContext =
                      PageContext.create(
                          callable,
                          LIST_REGION_INSTANCE_GROUP_MANAGERS_PAGE_STR_DESC,
                          request,
                          context);
              return ListRegionInstanceGroupManagersPagedResponse.createAsync(
                  pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListErrorsRegionInstanceGroupManagersHttpRequest,
          RegionInstanceGroupManagersListErrorsResponse,
          ListErrorsRegionInstanceGroupManagersPagedResponse>
      LIST_ERRORS_REGION_INSTANCE_GROUP_MANAGERS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListErrorsRegionInstanceGroupManagersHttpRequest,
              RegionInstanceGroupManagersListErrorsResponse,
              ListErrorsRegionInstanceGroupManagersPagedResponse>() {
            @Override
            public ApiFuture<ListErrorsRegionInstanceGroupManagersPagedResponse>
                getFuturePagedResponse(
                    UnaryCallable<
                            ListErrorsRegionInstanceGroupManagersHttpRequest,
                            RegionInstanceGroupManagersListErrorsResponse>
                        callable,
                    ListErrorsRegionInstanceGroupManagersHttpRequest request,
                    ApiCallContext context,
                    ApiFuture<RegionInstanceGroupManagersListErrorsResponse> futureResponse) {
              PageContext<
                      ListErrorsRegionInstanceGroupManagersHttpRequest,
                      RegionInstanceGroupManagersListErrorsResponse,
                      InstanceManagedByIgmError>
                  pageContext =
                      PageContext.create(
                          callable,
                          LIST_ERRORS_REGION_INSTANCE_GROUP_MANAGERS_PAGE_STR_DESC,
                          request,
                          context);
              return ListErrorsRegionInstanceGroupManagersPagedResponse.createAsync(
                  pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListManagedInstancesRegionInstanceGroupManagersHttpRequest,
          RegionInstanceGroupManagersListInstancesResponse,
          ListManagedInstancesRegionInstanceGroupManagersPagedResponse>
      LIST_MANAGED_INSTANCES_REGION_INSTANCE_GROUP_MANAGERS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListManagedInstancesRegionInstanceGroupManagersHttpRequest,
              RegionInstanceGroupManagersListInstancesResponse,
              ListManagedInstancesRegionInstanceGroupManagersPagedResponse>() {
            @Override
            public ApiFuture<ListManagedInstancesRegionInstanceGroupManagersPagedResponse>
                getFuturePagedResponse(
                    UnaryCallable<
                            ListManagedInstancesRegionInstanceGroupManagersHttpRequest,
                            RegionInstanceGroupManagersListInstancesResponse>
                        callable,
                    ListManagedInstancesRegionInstanceGroupManagersHttpRequest request,
                    ApiCallContext context,
                    ApiFuture<RegionInstanceGroupManagersListInstancesResponse> futureResponse) {
              PageContext<
                      ListManagedInstancesRegionInstanceGroupManagersHttpRequest,
                      RegionInstanceGroupManagersListInstancesResponse,
                      ManagedInstance>
                  pageContext =
                      PageContext.create(
                          callable,
                          LIST_MANAGED_INSTANCES_REGION_INSTANCE_GROUP_MANAGERS_PAGE_STR_DESC,
                          request,
                          context);
              return ListManagedInstancesRegionInstanceGroupManagersPagedResponse.createAsync(
                  pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListPerInstanceConfigsRegionInstanceGroupManagersHttpRequest,
          RegionInstanceGroupManagersListInstanceConfigsResp,
          ListPerInstanceConfigsRegionInstanceGroupManagersPagedResponse>
      LIST_PER_INSTANCE_CONFIGS_REGION_INSTANCE_GROUP_MANAGERS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListPerInstanceConfigsRegionInstanceGroupManagersHttpRequest,
              RegionInstanceGroupManagersListInstanceConfigsResp,
              ListPerInstanceConfigsRegionInstanceGroupManagersPagedResponse>() {
            @Override
            public ApiFuture<ListPerInstanceConfigsRegionInstanceGroupManagersPagedResponse>
                getFuturePagedResponse(
                    UnaryCallable<
                            ListPerInstanceConfigsRegionInstanceGroupManagersHttpRequest,
                            RegionInstanceGroupManagersListInstanceConfigsResp>
                        callable,
                    ListPerInstanceConfigsRegionInstanceGroupManagersHttpRequest request,
                    ApiCallContext context,
                    ApiFuture<RegionInstanceGroupManagersListInstanceConfigsResp> futureResponse) {
              PageContext<
                      ListPerInstanceConfigsRegionInstanceGroupManagersHttpRequest,
                      RegionInstanceGroupManagersListInstanceConfigsResp,
                      PerInstanceConfig>
                  pageContext =
                      PageContext.create(
                          callable,
                          LIST_PER_INSTANCE_CONFIGS_REGION_INSTANCE_GROUP_MANAGERS_PAGE_STR_DESC,
                          request,
                          context);
              return ListPerInstanceConfigsRegionInstanceGroupManagersPagedResponse.createAsync(
                  pageContext, futureResponse);
            }
          };

  /** Builder for RegionInstanceGroupManagerStubSettings. */
  public static class Builder
      extends StubSettings.Builder<RegionInstanceGroupManagerStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;

    private final UnaryCallSettings.Builder<
            AbandonInstancesRegionInstanceGroupManagerHttpRequest, Operation>
        abandonInstancesRegionInstanceGroupManagerSettings;
    private final UnaryCallSettings.Builder<
            ApplyUpdatesToInstancesRegionInstanceGroupManagerHttpRequest, Operation>
        applyUpdatesToInstancesRegionInstanceGroupManagerSettings;
    private final UnaryCallSettings.Builder<
            CreateInstancesRegionInstanceGroupManagerHttpRequest, Operation>
        createInstancesRegionInstanceGroupManagerSettings;
    private final UnaryCallSettings.Builder<DeleteRegionInstanceGroupManagerHttpRequest, Operation>
        deleteRegionInstanceGroupManagerSettings;
    private final UnaryCallSettings.Builder<
            DeleteInstancesRegionInstanceGroupManagerHttpRequest, Operation>
        deleteInstancesRegionInstanceGroupManagerSettings;
    private final UnaryCallSettings.Builder<
            DeletePerInstanceConfigsRegionInstanceGroupManagerHttpRequest, Operation>
        deletePerInstanceConfigsRegionInstanceGroupManagerSettings;
    private final UnaryCallSettings.Builder<
            GetRegionInstanceGroupManagerHttpRequest, InstanceGroupManager>
        getRegionInstanceGroupManagerSettings;
    private final UnaryCallSettings.Builder<InsertRegionInstanceGroupManagerHttpRequest, Operation>
        insertRegionInstanceGroupManagerSettings;
    private final PagedCallSettings.Builder<
            ListRegionInstanceGroupManagersHttpRequest,
            RegionInstanceGroupManagerList,
            ListRegionInstanceGroupManagersPagedResponse>
        listRegionInstanceGroupManagersSettings;
    private final PagedCallSettings.Builder<
            ListErrorsRegionInstanceGroupManagersHttpRequest,
            RegionInstanceGroupManagersListErrorsResponse,
            ListErrorsRegionInstanceGroupManagersPagedResponse>
        listErrorsRegionInstanceGroupManagersSettings;
    private final PagedCallSettings.Builder<
            ListManagedInstancesRegionInstanceGroupManagersHttpRequest,
            RegionInstanceGroupManagersListInstancesResponse,
            ListManagedInstancesRegionInstanceGroupManagersPagedResponse>
        listManagedInstancesRegionInstanceGroupManagersSettings;
    private final PagedCallSettings.Builder<
            ListPerInstanceConfigsRegionInstanceGroupManagersHttpRequest,
            RegionInstanceGroupManagersListInstanceConfigsResp,
            ListPerInstanceConfigsRegionInstanceGroupManagersPagedResponse>
        listPerInstanceConfigsRegionInstanceGroupManagersSettings;
    private final UnaryCallSettings.Builder<PatchRegionInstanceGroupManagerHttpRequest, Operation>
        patchRegionInstanceGroupManagerSettings;
    private final UnaryCallSettings.Builder<
            PatchPerInstanceConfigsRegionInstanceGroupManagerHttpRequest, Operation>
        patchPerInstanceConfigsRegionInstanceGroupManagerSettings;
    private final UnaryCallSettings.Builder<
            RecreateInstancesRegionInstanceGroupManagerHttpRequest, Operation>
        recreateInstancesRegionInstanceGroupManagerSettings;
    private final UnaryCallSettings.Builder<ResizeRegionInstanceGroupManagerHttpRequest, Operation>
        resizeRegionInstanceGroupManagerSettings;
    private final UnaryCallSettings.Builder<
            SetInstanceTemplateRegionInstanceGroupManagerHttpRequest, Operation>
        setInstanceTemplateRegionInstanceGroupManagerSettings;
    private final UnaryCallSettings.Builder<
            SetTargetPoolsRegionInstanceGroupManagerHttpRequest, Operation>
        setTargetPoolsRegionInstanceGroupManagerSettings;
    private final UnaryCallSettings.Builder<
            UpdatePerInstanceConfigsRegionInstanceGroupManagerHttpRequest, Operation>
        updatePerInstanceConfigsRegionInstanceGroupManagerSettings;

    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "idempotent",
          ImmutableSet.copyOf(
              Lists.<StatusCode.Code>newArrayList(
                  StatusCode.Code.DEADLINE_EXCEEDED, StatusCode.Code.UNAVAILABLE)));
      definitions.put("non_idempotent", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelay(Duration.ofMillis(100L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelay(Duration.ofMillis(60000L))
              .setInitialRpcTimeout(Duration.ofMillis(20000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(20000L))
              .setTotalTimeout(Duration.ofMillis(600000L))
              .build();
      definitions.put("default", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      abandonInstancesRegionInstanceGroupManagerSettings =
          UnaryCallSettings.newUnaryCallSettingsBuilder();

      applyUpdatesToInstancesRegionInstanceGroupManagerSettings =
          UnaryCallSettings.newUnaryCallSettingsBuilder();

      createInstancesRegionInstanceGroupManagerSettings =
          UnaryCallSettings.newUnaryCallSettingsBuilder();

      deleteRegionInstanceGroupManagerSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      deleteInstancesRegionInstanceGroupManagerSettings =
          UnaryCallSettings.newUnaryCallSettingsBuilder();

      deletePerInstanceConfigsRegionInstanceGroupManagerSettings =
          UnaryCallSettings.newUnaryCallSettingsBuilder();

      getRegionInstanceGroupManagerSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      insertRegionInstanceGroupManagerSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      listRegionInstanceGroupManagersSettings =
          PagedCallSettings.newBuilder(LIST_REGION_INSTANCE_GROUP_MANAGERS_PAGE_STR_FACT);

      listErrorsRegionInstanceGroupManagersSettings =
          PagedCallSettings.newBuilder(LIST_ERRORS_REGION_INSTANCE_GROUP_MANAGERS_PAGE_STR_FACT);

      listManagedInstancesRegionInstanceGroupManagersSettings =
          PagedCallSettings.newBuilder(
              LIST_MANAGED_INSTANCES_REGION_INSTANCE_GROUP_MANAGERS_PAGE_STR_FACT);

      listPerInstanceConfigsRegionInstanceGroupManagersSettings =
          PagedCallSettings.newBuilder(
              LIST_PER_INSTANCE_CONFIGS_REGION_INSTANCE_GROUP_MANAGERS_PAGE_STR_FACT);

      patchRegionInstanceGroupManagerSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      patchPerInstanceConfigsRegionInstanceGroupManagerSettings =
          UnaryCallSettings.newUnaryCallSettingsBuilder();

      recreateInstancesRegionInstanceGroupManagerSettings =
          UnaryCallSettings.newUnaryCallSettingsBuilder();

      resizeRegionInstanceGroupManagerSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      setInstanceTemplateRegionInstanceGroupManagerSettings =
          UnaryCallSettings.newUnaryCallSettingsBuilder();

      setTargetPoolsRegionInstanceGroupManagerSettings =
          UnaryCallSettings.newUnaryCallSettingsBuilder();

      updatePerInstanceConfigsRegionInstanceGroupManagerSettings =
          UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              abandonInstancesRegionInstanceGroupManagerSettings,
              applyUpdatesToInstancesRegionInstanceGroupManagerSettings,
              createInstancesRegionInstanceGroupManagerSettings,
              deleteRegionInstanceGroupManagerSettings,
              deleteInstancesRegionInstanceGroupManagerSettings,
              deletePerInstanceConfigsRegionInstanceGroupManagerSettings,
              getRegionInstanceGroupManagerSettings,
              insertRegionInstanceGroupManagerSettings,
              listRegionInstanceGroupManagersSettings,
              listErrorsRegionInstanceGroupManagersSettings,
              listManagedInstancesRegionInstanceGroupManagersSettings,
              listPerInstanceConfigsRegionInstanceGroupManagersSettings,
              patchRegionInstanceGroupManagerSettings,
              patchPerInstanceConfigsRegionInstanceGroupManagerSettings,
              recreateInstancesRegionInstanceGroupManagerSettings,
              resizeRegionInstanceGroupManagerSettings,
              setInstanceTemplateRegionInstanceGroupManagerSettings,
              setTargetPoolsRegionInstanceGroupManagerSettings,
              updatePerInstanceConfigsRegionInstanceGroupManagerSettings);

      initDefaults(this);
    }

    private static Builder createDefault() {
      Builder builder = new Builder((ClientContext) null);
      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());
      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {

      builder
          .abandonInstancesRegionInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .applyUpdatesToInstancesRegionInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .createInstancesRegionInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .deleteRegionInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .deleteInstancesRegionInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .deletePerInstanceConfigsRegionInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .getRegionInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .insertRegionInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listRegionInstanceGroupManagersSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listErrorsRegionInstanceGroupManagersSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listManagedInstancesRegionInstanceGroupManagersSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listPerInstanceConfigsRegionInstanceGroupManagersSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .patchRegionInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .patchPerInstanceConfigsRegionInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .recreateInstancesRegionInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .resizeRegionInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .setInstanceTemplateRegionInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .setTargetPoolsRegionInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .updatePerInstanceConfigsRegionInstanceGroupManagerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    protected Builder(RegionInstanceGroupManagerStubSettings settings) {
      super(settings);

      abandonInstancesRegionInstanceGroupManagerSettings =
          settings.abandonInstancesRegionInstanceGroupManagerSettings.toBuilder();
      applyUpdatesToInstancesRegionInstanceGroupManagerSettings =
          settings.applyUpdatesToInstancesRegionInstanceGroupManagerSettings.toBuilder();
      createInstancesRegionInstanceGroupManagerSettings =
          settings.createInstancesRegionInstanceGroupManagerSettings.toBuilder();
      deleteRegionInstanceGroupManagerSettings =
          settings.deleteRegionInstanceGroupManagerSettings.toBuilder();
      deleteInstancesRegionInstanceGroupManagerSettings =
          settings.deleteInstancesRegionInstanceGroupManagerSettings.toBuilder();
      deletePerInstanceConfigsRegionInstanceGroupManagerSettings =
          settings.deletePerInstanceConfigsRegionInstanceGroupManagerSettings.toBuilder();
      getRegionInstanceGroupManagerSettings =
          settings.getRegionInstanceGroupManagerSettings.toBuilder();
      insertRegionInstanceGroupManagerSettings =
          settings.insertRegionInstanceGroupManagerSettings.toBuilder();
      listRegionInstanceGroupManagersSettings =
          settings.listRegionInstanceGroupManagersSettings.toBuilder();
      listErrorsRegionInstanceGroupManagersSettings =
          settings.listErrorsRegionInstanceGroupManagersSettings.toBuilder();
      listManagedInstancesRegionInstanceGroupManagersSettings =
          settings.listManagedInstancesRegionInstanceGroupManagersSettings.toBuilder();
      listPerInstanceConfigsRegionInstanceGroupManagersSettings =
          settings.listPerInstanceConfigsRegionInstanceGroupManagersSettings.toBuilder();
      patchRegionInstanceGroupManagerSettings =
          settings.patchRegionInstanceGroupManagerSettings.toBuilder();
      patchPerInstanceConfigsRegionInstanceGroupManagerSettings =
          settings.patchPerInstanceConfigsRegionInstanceGroupManagerSettings.toBuilder();
      recreateInstancesRegionInstanceGroupManagerSettings =
          settings.recreateInstancesRegionInstanceGroupManagerSettings.toBuilder();
      resizeRegionInstanceGroupManagerSettings =
          settings.resizeRegionInstanceGroupManagerSettings.toBuilder();
      setInstanceTemplateRegionInstanceGroupManagerSettings =
          settings.setInstanceTemplateRegionInstanceGroupManagerSettings.toBuilder();
      setTargetPoolsRegionInstanceGroupManagerSettings =
          settings.setTargetPoolsRegionInstanceGroupManagerSettings.toBuilder();
      updatePerInstanceConfigsRegionInstanceGroupManagerSettings =
          settings.updatePerInstanceConfigsRegionInstanceGroupManagerSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              abandonInstancesRegionInstanceGroupManagerSettings,
              applyUpdatesToInstancesRegionInstanceGroupManagerSettings,
              createInstancesRegionInstanceGroupManagerSettings,
              deleteRegionInstanceGroupManagerSettings,
              deleteInstancesRegionInstanceGroupManagerSettings,
              deletePerInstanceConfigsRegionInstanceGroupManagerSettings,
              getRegionInstanceGroupManagerSettings,
              insertRegionInstanceGroupManagerSettings,
              listRegionInstanceGroupManagersSettings,
              listErrorsRegionInstanceGroupManagersSettings,
              listManagedInstancesRegionInstanceGroupManagersSettings,
              listPerInstanceConfigsRegionInstanceGroupManagersSettings,
              patchRegionInstanceGroupManagerSettings,
              patchPerInstanceConfigsRegionInstanceGroupManagerSettings,
              recreateInstancesRegionInstanceGroupManagerSettings,
              resizeRegionInstanceGroupManagerSettings,
              setInstanceTemplateRegionInstanceGroupManagerSettings,
              setTargetPoolsRegionInstanceGroupManagerSettings,
              updatePerInstanceConfigsRegionInstanceGroupManagerSettings);
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /**
     * Returns the builder for the settings used for calls to
     * abandonInstancesRegionInstanceGroupManager.
     */
    public UnaryCallSettings.Builder<
            AbandonInstancesRegionInstanceGroupManagerHttpRequest, Operation>
        abandonInstancesRegionInstanceGroupManagerSettings() {
      return abandonInstancesRegionInstanceGroupManagerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to
     * applyUpdatesToInstancesRegionInstanceGroupManager.
     */
    public UnaryCallSettings.Builder<
            ApplyUpdatesToInstancesRegionInstanceGroupManagerHttpRequest, Operation>
        applyUpdatesToInstancesRegionInstanceGroupManagerSettings() {
      return applyUpdatesToInstancesRegionInstanceGroupManagerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to
     * createInstancesRegionInstanceGroupManager.
     */
    public UnaryCallSettings.Builder<
            CreateInstancesRegionInstanceGroupManagerHttpRequest, Operation>
        createInstancesRegionInstanceGroupManagerSettings() {
      return createInstancesRegionInstanceGroupManagerSettings;
    }

    /** Returns the builder for the settings used for calls to deleteRegionInstanceGroupManager. */
    public UnaryCallSettings.Builder<DeleteRegionInstanceGroupManagerHttpRequest, Operation>
        deleteRegionInstanceGroupManagerSettings() {
      return deleteRegionInstanceGroupManagerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to
     * deleteInstancesRegionInstanceGroupManager.
     */
    public UnaryCallSettings.Builder<
            DeleteInstancesRegionInstanceGroupManagerHttpRequest, Operation>
        deleteInstancesRegionInstanceGroupManagerSettings() {
      return deleteInstancesRegionInstanceGroupManagerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to
     * deletePerInstanceConfigsRegionInstanceGroupManager.
     */
    public UnaryCallSettings.Builder<
            DeletePerInstanceConfigsRegionInstanceGroupManagerHttpRequest, Operation>
        deletePerInstanceConfigsRegionInstanceGroupManagerSettings() {
      return deletePerInstanceConfigsRegionInstanceGroupManagerSettings;
    }

    /** Returns the builder for the settings used for calls to getRegionInstanceGroupManager. */
    public UnaryCallSettings.Builder<GetRegionInstanceGroupManagerHttpRequest, InstanceGroupManager>
        getRegionInstanceGroupManagerSettings() {
      return getRegionInstanceGroupManagerSettings;
    }

    /** Returns the builder for the settings used for calls to insertRegionInstanceGroupManager. */
    public UnaryCallSettings.Builder<InsertRegionInstanceGroupManagerHttpRequest, Operation>
        insertRegionInstanceGroupManagerSettings() {
      return insertRegionInstanceGroupManagerSettings;
    }

    /** Returns the builder for the settings used for calls to listRegionInstanceGroupManagers. */
    public PagedCallSettings.Builder<
            ListRegionInstanceGroupManagersHttpRequest,
            RegionInstanceGroupManagerList,
            ListRegionInstanceGroupManagersPagedResponse>
        listRegionInstanceGroupManagersSettings() {
      return listRegionInstanceGroupManagersSettings;
    }

    /**
     * Returns the builder for the settings used for calls to listErrorsRegionInstanceGroupManagers.
     */
    public PagedCallSettings.Builder<
            ListErrorsRegionInstanceGroupManagersHttpRequest,
            RegionInstanceGroupManagersListErrorsResponse,
            ListErrorsRegionInstanceGroupManagersPagedResponse>
        listErrorsRegionInstanceGroupManagersSettings() {
      return listErrorsRegionInstanceGroupManagersSettings;
    }

    /**
     * Returns the builder for the settings used for calls to
     * listManagedInstancesRegionInstanceGroupManagers.
     */
    public PagedCallSettings.Builder<
            ListManagedInstancesRegionInstanceGroupManagersHttpRequest,
            RegionInstanceGroupManagersListInstancesResponse,
            ListManagedInstancesRegionInstanceGroupManagersPagedResponse>
        listManagedInstancesRegionInstanceGroupManagersSettings() {
      return listManagedInstancesRegionInstanceGroupManagersSettings;
    }

    /**
     * Returns the builder for the settings used for calls to
     * listPerInstanceConfigsRegionInstanceGroupManagers.
     */
    public PagedCallSettings.Builder<
            ListPerInstanceConfigsRegionInstanceGroupManagersHttpRequest,
            RegionInstanceGroupManagersListInstanceConfigsResp,
            ListPerInstanceConfigsRegionInstanceGroupManagersPagedResponse>
        listPerInstanceConfigsRegionInstanceGroupManagersSettings() {
      return listPerInstanceConfigsRegionInstanceGroupManagersSettings;
    }

    /** Returns the builder for the settings used for calls to patchRegionInstanceGroupManager. */
    public UnaryCallSettings.Builder<PatchRegionInstanceGroupManagerHttpRequest, Operation>
        patchRegionInstanceGroupManagerSettings() {
      return patchRegionInstanceGroupManagerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to
     * patchPerInstanceConfigsRegionInstanceGroupManager.
     */
    public UnaryCallSettings.Builder<
            PatchPerInstanceConfigsRegionInstanceGroupManagerHttpRequest, Operation>
        patchPerInstanceConfigsRegionInstanceGroupManagerSettings() {
      return patchPerInstanceConfigsRegionInstanceGroupManagerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to
     * recreateInstancesRegionInstanceGroupManager.
     */
    public UnaryCallSettings.Builder<
            RecreateInstancesRegionInstanceGroupManagerHttpRequest, Operation>
        recreateInstancesRegionInstanceGroupManagerSettings() {
      return recreateInstancesRegionInstanceGroupManagerSettings;
    }

    /** Returns the builder for the settings used for calls to resizeRegionInstanceGroupManager. */
    public UnaryCallSettings.Builder<ResizeRegionInstanceGroupManagerHttpRequest, Operation>
        resizeRegionInstanceGroupManagerSettings() {
      return resizeRegionInstanceGroupManagerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to
     * setInstanceTemplateRegionInstanceGroupManager.
     */
    public UnaryCallSettings.Builder<
            SetInstanceTemplateRegionInstanceGroupManagerHttpRequest, Operation>
        setInstanceTemplateRegionInstanceGroupManagerSettings() {
      return setInstanceTemplateRegionInstanceGroupManagerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to
     * setTargetPoolsRegionInstanceGroupManager.
     */
    public UnaryCallSettings.Builder<SetTargetPoolsRegionInstanceGroupManagerHttpRequest, Operation>
        setTargetPoolsRegionInstanceGroupManagerSettings() {
      return setTargetPoolsRegionInstanceGroupManagerSettings;
    }

    /**
     * Returns the builder for the settings used for calls to
     * updatePerInstanceConfigsRegionInstanceGroupManager.
     */
    public UnaryCallSettings.Builder<
            UpdatePerInstanceConfigsRegionInstanceGroupManagerHttpRequest, Operation>
        updatePerInstanceConfigsRegionInstanceGroupManagerSettings() {
      return updatePerInstanceConfigsRegionInstanceGroupManagerSettings;
    }

    @Override
    public RegionInstanceGroupManagerStubSettings build() throws IOException {
      return new RegionInstanceGroupManagerStubSettings(this);
    }
  }
}
