package com.tesa.taskapi1.service;

    import com.google.gson.Gson;
    import com.tesa.taskapi1.model.response.EmailResponse;
    import okhttp3.*;
    import org.springframework.stereotype.Service;

    import java.io.IOException;
    import java.time.LocalDateTime;
    import java.util.List;
    import java.util.Map;
    import java.util.stream.Collectors;

    @Service
    public class EmailService {
        private static final String API_URL = "https://api.mailersend.com/v1/email";
        private static final String API_KEY = "mlsn.7c840ed9a3e7b4b20856a904f57059332790998ac9be664802e56b860937a2b5";
        private static final OkHttpClient client = new OkHttpClient();
        private static final Gson gson = new Gson();

        public EmailResponse sendEmail(List<String> recipientEmails, String subject, String message) {
            // Convert list of recipient emails to list of maps
            List<Map<String, String>> recipients = recipientEmails.stream()
                    .map(email -> Map.of("email", email))
                    .toList();

            // Build JSON payload
            String jsonBody = gson.toJson(Map.of(
                    "from", Map.of("email", "info@trial-351ndgwjq6xlzqx8.mlsender.net"),
                    "to", recipients,
                    "subject", subject,
                    "text", message + " " + LocalDateTime.now(),
                    "html", message + " " + LocalDateTime.now()
            ));

            // Create request body
            RequestBody body = RequestBody.create(jsonBody, MediaType.get("application/json; charset=utf-8"));

            // Create request
            Request request = new Request.Builder()
                    .url(API_URL)
                    .post(body)
                    .addHeader("Content-Type", "application/json")
                    .addHeader("Authorization", "Bearer " + API_KEY)
                    .build();

            // Execute request
            try (Response response = client.newCall(request).execute()) {
                if (response.isSuccessful()) {
                    return new EmailResponse("00", "Email sent successfully!");
                } else {
                    return new EmailResponse("106", "Failed: " + response.message());
                }
            } catch (IOException e) {
                return new EmailResponse("106", "Error: " + e.getMessage());
            }
        }

        public String test(String subject){
            return subject + " " + LocalDateTime.now();
        }
    }