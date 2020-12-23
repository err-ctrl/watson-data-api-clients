/*
 * Copyright 2020 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ibm.watson.data.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ModelRevisionEntityRequest
 */
public class ModelRevisionEntityRequest {

    private String spaceId;
    private String projectId;
    private String commitMessage;

    public ModelRevisionEntityRequest spaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }

    /**
     * The space that contains the resource. Either &#x60;space_id&#x60; or &#x60;project_id&#x60; has to be given.
     * @return spaceId
     **/
    @javax.annotation.Nullable
    @JsonProperty("space_id")
    @JsonInclude(value = JsonInclude.Include.NON_NULL)
    public String getSpaceId() { return spaceId; }
    public void setSpaceId(String spaceId) { this.spaceId = spaceId; }

    public ModelRevisionEntityRequest projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * The project that contains the resource. Either &#x60;space_id&#x60; or &#x60;project_id&#x60; has to be given.
     * @return projectId
     **/
    @javax.annotation.Nullable
    @JsonProperty("project_id")
    @JsonInclude(value = JsonInclude.Include.NON_NULL)
    public String getProjectId() { return projectId; }
    public void setProjectId(String projectId) { this.projectId = projectId; }

    public ModelRevisionEntityRequest commitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
        return this;
    }

    /**
     * An optional commit message for the revision.
     * @return commitMessage
     **/
    @javax.annotation.Nullable
    @JsonProperty("commit_message")
    @JsonInclude(value = JsonInclude.Include.NON_NULL)
    public String getCommitMessage() { return commitMessage; }
    public void setCommitMessage(String commitMessage) { this.commitMessage = commitMessage; }

    @Override
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) { return false; }
        ModelRevisionEntityRequest modelRevisionEntityRequest = (ModelRevisionEntityRequest) o;
        return Objects.equals(this.spaceId, modelRevisionEntityRequest.spaceId) &&
                Objects.equals(this.projectId, modelRevisionEntityRequest.projectId) &&
                Objects.equals(this.commitMessage, modelRevisionEntityRequest.commitMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(spaceId, projectId, commitMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelRevisionEntityRequest {\n");
        sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    commitMessage: ").append(toIndentedString(commitMessage)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) { return "null"; }
        return o.toString().replace("\n", "\n    ");
    }

}
