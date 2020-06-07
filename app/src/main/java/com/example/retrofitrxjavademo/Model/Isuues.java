package com.example.retrofitrxjavademo.Model;

import java.util.Date;
import java.util.List;

public class Isuues {
    public int id;
    public String node_id;
    public String url;
    public String repository_url;
    public String labels_url;
    public String comments_url;
    public String events_url;
    public String html_url;
    public int number;
    public String state;
    public String title;
    public String body;
    public User user;
    public List<Label> labels;
    public Assignee assignee;
    public List<Assignee> assignees;
    public Milestone milestone;
    public boolean locked;
    public String active_lock_reason;
    public int comments;
    public PullRequest pull_request;
    public Date closed_at;
    public Date created_at;
    public Date updated_at;

    public Isuues() {

    }

    public Isuues(int id, String node_id, String url, String repository_url, String labels_url, String comments_url, String events_url, String html_url, int number, String state, String title, String body, User user, List<Label> labels, Assignee assignee, List<Assignee> assignees, Milestone milestone, boolean locked, String active_lock_reason, int comments, PullRequest pull_request, Date closed_at, Date created_at, Date updated_at) {
        this.id = id;
        this.node_id = node_id;
        this.url = url;
        this.repository_url = repository_url;
        this.labels_url = labels_url;
        this.comments_url = comments_url;
        this.events_url = events_url;
        this.html_url = html_url;
        this.number = number;
        this.state = state;
        this.title = title;
        this.body = body;
        this.user = user;
        this.labels = labels;
        this.assignee = assignee;
        this.assignees = assignees;
        this.milestone = milestone;
        this.locked = locked;
        this.active_lock_reason = active_lock_reason;
        this.comments = comments;
        this.pull_request = pull_request;
        this.closed_at = closed_at;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public class User
    {
        public String login;
        public int id;
        public String node_id;
        public String avatar_url;
        public String gravatar_id;
        public String url;
        public String html_url;
        public String followers_url;
        public String following_url;
        public String gists_url;
        public String starred_url;
        public String subscriptions_url;
        public String organizations_url;
        public String repos_url;
        public String events_url;
        public String received_events_url;
        public String type;
        public boolean site_admin;
    }

    public class Label
    {
        public int id;
        public String node_id;
        public String url;
        public String name;
        public String description;
        public String color;
        public boolean _default;
    }

    public class Assignee
    {
        public String login;
        public int id;
        public String node_id;
        public String avatar_url;
        public String gravatar_id;
        public String url;
        public String html_url;
        public String followers_url;
        public String following_url;
        public String gists_url;
        public String starred_url;
        public String subscriptions_url;
        public String organizations_url;
        public String repos_url;
        public String events_url;
        public String received_events_url;
        public String type;
        public boolean site_admin;
    }

    public class Creator
    {
        public String login;
        public int id;
        public String node_id;
        public String avatar_url;
        public String gravatar_id;
        public String url;
        public String html_url;
        public String followers_url;
        public String following_url;
        public String gists_url;
        public String starred_url;
        public String subscriptions_url;
        public String organizations_url;
        public String repos_url;
        public String events_url;
        public String received_events_url;
        public String type;
        public boolean site_admin;
    }

    public class Milestone
    {
        public String url;
        public String html_url;
        public String labels_url;
        public int id;
        public String node_id;
        public int number;
        public String state;
        public String title;
        public String description;
        public Creator creator;
        public int open_issues;
        public int closed_issues;
        public Date created_at;
        public Date updated_at;
        public Date closed_at;
        public Date due_on;
    }

    public class PullRequest
    {
        public String url;
        public String html_url;
        public String diff_url;
        public String patch_url;
    }
}

