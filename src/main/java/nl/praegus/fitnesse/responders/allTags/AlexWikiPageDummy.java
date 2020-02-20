package nl.praegus.fitnesse.responders.allTags;

import fitnesse.util.Clock;
import fitnesse.wiki.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class AlexWikiPageDummy extends BaseWikiPage {
    private PageData pageData;

    public AlexWikiPageDummy(String name, String content, WikiPage parent, WikiPageProperty property) {
        super(name, parent);
        this.pageData = new PageData(content, property);
    }

    public AlexWikiPageDummy() {
        super("Default", (WikiPage)null);
        this.pageData = new PageData("", new WikiPageProperty());
    }

    public PageData getData() {
        return this.pageData;
    }

    public Collection<VersionInfo> getVersions() {
        return Collections.emptySet();
    }

    public VersionInfo commit(PageData data) {
        this.pageData = data;
        return new VersionInfo("mockVersionName", "mockAuthor", Clock.currentDate());
    }

    public List<WikiPage> getChildren() {
        return new ArrayList<>();
    }

    public WikiPage getVersion(String versionName) {
        return this;
    }

    public String getHtml() {
        return String.format("<em>%s</em>", this.pageData.getContent());
    }

    public void removeChildPage(String name) {
    }

    public String getVariable(String name) {
        return null;
    }

    public WikiPage addChildPage(String name) {
        return null;
    }

    public WikiPage getChildPage(String name) {
        return null;
    }
}

