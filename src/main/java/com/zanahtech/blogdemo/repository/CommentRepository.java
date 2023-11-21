package com.zanahtech.blogdemo.repository;

import com.zanahtech.blogdemo.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.UUID;

public class CommentRepository implements CrudRepository<Comment, UUID> {
    @Override
    public <S extends Comment> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Comment> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Comment> findById(UUID uuid) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(UUID uuid) {
        return false;
    }

    @Override
    public Iterable<Comment> findAll() {
        return null;
    }

    @Override
    public Iterable<Comment> findAllById(Iterable<UUID> uuids) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(UUID uuid) {

    }

    @Override
    public void delete(Comment entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends UUID> uuids) {

    }

    @Override
    public void deleteAll(Iterable<? extends Comment> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
