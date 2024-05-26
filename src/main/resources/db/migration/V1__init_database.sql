CREATE TABLE vehicle (
    id SERIAL PRIMARY KEY,
    make VARCHAR(255),
    model VARCHAR(255),
    vehicle_type VARCHAR(255),  -- Discriminator column
    number_of_doors INTEGER,    -- Specific to Car
    has_sunroof BOOLEAN,        -- Specific to Car
    load_capacity float,        -- Specific to Truck
    has_trailer BOOLEAN         -- Specific to Truck
);