package io.github.ddk.core.mapper;

import org.mapstruct.Mapper;

/**
 * @author Elijah Du
 * @date 2025/2/11
 */
@Mapper(componentModel = "spring")
public interface DefaultMapper<S, T> extends ObjectMapper<S, T> {
}
