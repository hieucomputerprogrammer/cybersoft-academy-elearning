package edu.cybersoft.elearning.dto.model;

import edu.cybersoft.elearning.domain.model.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VideoDto extends BaseEntity {
    private String title;

    private String url;

    private int timeCount;

    private String courseTitle;

    public VideoDto(Long id, String title, String url, int timeCount, String courseTitle) {
        super(id);
        this.title = title;
        this.url = url;
        this.timeCount = timeCount;
        this.courseTitle = courseTitle;
    }
}