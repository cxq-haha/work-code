package cn.ac.xiaolima.workcode.mapstruct;

import lombok.Data;

import java.util.List;

@Data
public class Source {
    private Integer id;

    private List<String> ips;
}
