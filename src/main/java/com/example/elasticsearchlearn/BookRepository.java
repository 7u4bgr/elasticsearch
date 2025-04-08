package com.example.elasticsearchlearn;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface BookRepository extends ElasticsearchRepository<Book, String> {
List<Book> findByAuthor(String name);
}
