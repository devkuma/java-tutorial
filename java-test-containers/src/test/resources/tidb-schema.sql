
create table r_follow_post
(
    smid varchar(33) not null comment 'Subscribe Mid',
    pid  bigint      not null comment 'Post Id',
    omid varchar(33) not null comment 'Owner Mid',
    type varchar(1)  not null comment 'subscribe post type',
    crtm bigint      null comment 'Create Time',
    primary key (smid, pid)
)
    comment 'follow Post Table';

create index idx_r_follow_post_crtm
    on r_follow_post (crtm);

create index idx_r_follow_post_omid
    on r_follow_post (omid);

create index idx_r_follow_post_pid
    on r_follow_post (pid);
