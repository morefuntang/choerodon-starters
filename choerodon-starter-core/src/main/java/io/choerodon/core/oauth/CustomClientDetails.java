package io.choerodon.core.oauth;

import org.springframework.security.oauth2.provider.client.BaseClientDetails;

/**
 * 定制的clientDetail对象，添加了组织ID
 *
 * @author wuguokai
 */
public class CustomClientDetails extends BaseClientDetails {

    private Long organizationId;

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CustomClientDetails)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }

        CustomClientDetails that = (CustomClientDetails) o;

        return organizationId.equals(that.organizationId);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + organizationId.hashCode();
        return result;
    }
}
