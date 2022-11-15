package com.cadonuno.scaautolinker.util;

import java.util.List;
import java.util.Objects;

public final class Workspace {
    private final String guid;
    private final String siteId;
    private final String name;
    private final List<Project> projects;

    public Workspace(String guid, String siteId, String name, List<Project> projects) {
        this.guid = guid;
        this.siteId = siteId;
        this.name = name;
        this.projects = projects;
    }

    public String getGuid() {
        return guid;
    }

    public String getSiteId() {
        return siteId;
    }

    public String getName() {
        return name;
    }

    public List<Project> getProjects() {
        return projects;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Workspace) obj;
        return Objects.equals(this.guid, that.guid) &&
                Objects.equals(this.siteId, that.siteId) &&
                Objects.equals(this.name, that.name) &&
                Objects.equals(this.projects, that.projects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(guid, siteId, name, projects);
    }

    @Override
    public String toString() {
        return "Workspace[" +
                "guid=" + guid + ", " +
                "siteId=" + siteId + ", " +
                "name=" + name + ", " +
                "projects=" + projects + ']';
    }

}
