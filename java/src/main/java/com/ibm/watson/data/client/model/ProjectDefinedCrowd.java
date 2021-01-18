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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * The Defined Crowd feature integration with the project.
 */
public class ProjectDefinedCrowd {

    private String accessKeyId;
    private String accessKeySecret;

    public ProjectDefinedCrowd accessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }

    /**
     * The access key ID for a defined crowd resource.
     * @return accessKeyId
     **/
    @JsonProperty("access_key_id")
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getAccessKeyId() { return accessKeyId; }
    public void setAccessKeyId(String accessKeyId) { this.accessKeyId = accessKeyId; }

    public ProjectDefinedCrowd accessKeySecret(String accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
        return this;
    }

    /**
     * The access key secret for a defined crowd resource.
     * @return accessKeySecret
     **/
    @JsonProperty("access_key_secret")
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getAccessKeySecret() { return accessKeySecret; }
    public void setAccessKeySecret(String accessKeySecret) { this.accessKeySecret = accessKeySecret; }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) { return false; }
        ProjectDefinedCrowd projectDefinedCrowd = (ProjectDefinedCrowd)o;
        return Objects.equals(this.accessKeyId, projectDefinedCrowd.accessKeyId) &&
                Objects.equals(this.accessKeySecret,
                        projectDefinedCrowd.accessKeySecret);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessKeyId, accessKeySecret);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectDefinedCrowd {\n");
        sb.append("    accessKeyId: ").append(toIndentedString(accessKeyId)).append("\n");
        sb.append("    accessKeySecret: ").append(toIndentedString(accessKeySecret)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) { return "null"; }
        return o.toString().replace("\n", "\n    ");
    }

}
