package io.recruitment.assessment.api.mapper;

import io.recruitment.assessment.api.dto.authentication.AuthenticationResponse;
import io.recruitment.assessment.api.dto.news.NewsRequest;
import io.recruitment.assessment.api.dto.news.NewsResponse;
import io.recruitment.assessment.api.dto.order.CartResponse;
import io.recruitment.assessment.api.dto.order.ItemResponse;
import io.recruitment.assessment.api.dto.order.OrderResponse;
import io.recruitment.assessment.api.dto.product.ProductRequest;
import io.recruitment.assessment.api.dto.product.ProductResponse;
import io.recruitment.assessment.api.model.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;
import java.util.Map;

@Mapper(componentModel = "spring")
public interface MapStructMapper {
    ProductResponse productToProductDto(Product product);

    Product productDtoToProduct(ProductRequest productRequest);

    NewsResponse newsToNewsDto(News news);

    News newsDtoToNews(NewsRequest newsRequest);

    AuthenticationResponse toAuthDto(Map<String, String> map);

    CartResponse cartToCartDto(Cart cart);

    @Mapping(source = "product.id", target = "productID")
    ItemResponse itemToItemDto(Item item);

    OrderResponse orderToOrderDto(Order order);

    List<OrderResponse> toOrderDto(List<Order> orders);
}
