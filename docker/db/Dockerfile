FROM postgres:9.4.20

ENV LANG en_US.utf8

ENV PATH $PATH:/usr/lib/postgresql/$PG_MAJOR/bin
ENV PGDATA /var/lib/postgresql/data
ENV POSTGRES_DB migration_test_db
ENV POSTGRES_USER migrationtestdbuser
ENV POSTGRES_PASSWORD migrationtestdbpassword

RUN mkdir -p "$PGDATA" && chown -R postgres:postgres "$PGDATA" && chmod 777 "$PGDATA"
VOLUME /var/lib/postgresql/data

EXPOSE 5432
CMD ["postgres"]