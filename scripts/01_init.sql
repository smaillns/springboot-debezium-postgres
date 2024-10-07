CREATE TABLE public.store (
                              id bigserial NOT NULL,
                              address varchar(255) NULL,
                              label varchar(255) NULL,
                              CONSTRAINT store_pkey PRIMARY KEY (id)
);
