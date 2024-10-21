package com.cloud.portfolio.home;

import java.util.Date;

public record Home(
        String name,
        String address,
        String phone,
        String linkedIn,
        String github,
        String description,
        String cv,
        Date date
) {
}
