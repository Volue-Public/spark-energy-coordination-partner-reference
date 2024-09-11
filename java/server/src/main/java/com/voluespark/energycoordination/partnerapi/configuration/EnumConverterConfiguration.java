package com.voluespark.energycoordination.partnerapi.configuration;

import com.voluespark.energycoordination.partnerapi.model.Currency;
import com.voluespark.energycoordination.partnerapi.model.EnergyUnit;
import com.voluespark.energycoordination.partnerapi.model.NotificationType;
import com.voluespark.energycoordination.partnerapi.model.PriceArea;
import com.voluespark.energycoordination.partnerapi.model.SparkEventPayloadType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

@Configuration
public class EnumConverterConfiguration {

  @Bean(
      name =
          "com.voluespark.energycoordination.partnerapi.configuration.EnumConverterConfiguration.currencyConverter")
  Converter<String, Currency> currencyConverter() {
    return new Converter<String, Currency>() {
      @Override
      public Currency convert(String source) {
        return Currency.fromValue(source);
      }
    };
  }

  @Bean(
      name =
          "com.voluespark.energycoordination.partnerapi.configuration.EnumConverterConfiguration.energyUnitConverter")
  Converter<String, EnergyUnit> energyUnitConverter() {
    return new Converter<String, EnergyUnit>() {
      @Override
      public EnergyUnit convert(String source) {
        return EnergyUnit.fromValue(source);
      }
    };
  }

  @Bean(
      name =
          "com.voluespark.energycoordination.partnerapi.configuration.EnumConverterConfiguration.notificationTypeConverter")
  Converter<String, NotificationType> notificationTypeConverter() {
    return new Converter<String, NotificationType>() {
      @Override
      public NotificationType convert(String source) {
        return NotificationType.fromValue(source);
      }
    };
  }

  @Bean(
      name =
          "com.voluespark.energycoordination.partnerapi.configuration.EnumConverterConfiguration.priceAreaConverter")
  Converter<String, PriceArea> priceAreaConverter() {
    return new Converter<String, PriceArea>() {
      @Override
      public PriceArea convert(String source) {
        return PriceArea.fromValue(source);
      }
    };
  }

  @Bean(
      name =
          "com.voluespark.energycoordination.partnerapi.configuration.EnumConverterConfiguration.sparkEventPayloadTypeConverter")
  Converter<String, SparkEventPayloadType> sparkEventPayloadTypeConverter() {
    return new Converter<String, SparkEventPayloadType>() {
      @Override
      public SparkEventPayloadType convert(String source) {
        return SparkEventPayloadType.fromValue(source);
      }
    };
  }
}
