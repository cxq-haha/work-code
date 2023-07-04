package cn.ac.xiaolima.workcode.mapstruct;

import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring")
@DecoratedWith(value = MyMapperDecorator.class)
public interface MyMapper {
    @Mappings(
            {
                    @Mapping(source = "id", target = "id"),
                    @Mapping(source = "ips", target = "ips", qualifiedByName = "listToString")
            }
    )
    Target convert(Source source);

    @Named("listToString")
    default String listToString(List<String> ips) {
        MyMapperDecorator.speak();
        return String.join(",", ips);
    }
}
