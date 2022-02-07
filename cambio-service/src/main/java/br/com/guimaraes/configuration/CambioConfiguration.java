package br.com.guimaraes.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
@ConfigurationProperties("cambio-service")
public class CambioConfiguration {
    private String cambio;
    private String defaultValue;

    public CambioConfiguration() {}

	public String getCambio() {
		return cambio;
	}

	public void setCambio(String cambio) {
		this.cambio = cambio;
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

}
